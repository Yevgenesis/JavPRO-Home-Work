package de.telran.homeWork.hw_11.bank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BankApp {
    /*
        Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате при входе.
    При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
    Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
    После регистрации - вы получаете номер талончика, который генерируется строго по порядку.
    По умолчанию, все клиенты обслуживаются в порядке возрастания номеров талончиков, но если есть клиенты, которые пришли выполнить
    Вложение средств или Открытие депозита - они будут обслужены вне очереди.
    Но начиная с определенного времени (например с 10 - 12 часов), без очереди обслуживаются люди пенсионного возраста (возраст более 65).
    Создать множество, которое будет обслуживать класс Ticket.
    Подумайте какой тип Set - а вы могли бы использовать для этой задачи и с помощью каких механизмов вы могли бы реализовать меняющиеся
    условия работы обслуживания клиентов на протяжении рабочего дня. */


    public static final int YEAR = 2023; // Думаю, что это плохой вариант получения текущего года, но пока так

    public static void main(String[] args) {
        SortedSet<Ticket> queueTicket = new TreeSet<>(new TicketComparator());

        Ticket n1 = new Ticket("Ivanov A.I.", 1990, Services.COUNSELING);
        Ticket n2 = new Ticket("Petrov V.V.", 1985, Services.INVESTING_FUNDS);
        Ticket n3 = new Ticket("Sidorov M.G.", 1995, Services.OPENING_DEPOSIT);
        Ticket n4 = new Ticket("Mahmudov G.G.", 1958, Services.UTILITY_PAYMENTS);
        Ticket n5 = new Ticket("Lee B.B.", 1990, Services.RECEIVING_FUNDS);

        queueTicket.addAll(Arrays.asList(n1, n2, n3, n4, n5));

        printQueue(queueTicket);

        // Если наступает время обслуживания пенсионеров.
        // Включаем в компараторе сортировку по возрасту клиентов. Пересчитываем порядок очереди
        queueTicket = recalculateQueue(queueTicket, new TicketComparator(true));

        printQueue(queueTicket);

    }

    private static SortedSet<Ticket> recalculateQueue(SortedSet<Ticket> oldQueue, Comparator<Ticket> newComparator) {
        SortedSet<Ticket> newQueue = new TreeSet<>(newComparator);
        for (Ticket ticket : oldQueue) {
            newQueue.add(ticket);
        }
        return newQueue;
    }

    private static void printQueue(SortedSet<Ticket> queueTicket) {
        for (Ticket ticket : queueTicket) {
            System.out.println(ticket);
        }
        System.out.println();
    }
}

class TicketComparator implements Comparator<Ticket> {
    private boolean isPensionerTime;

    public TicketComparator(boolean isPensionerTime) {
        this.isPensionerTime = isPensionerTime;
    }

    public TicketComparator() {
    }

    @Override
    public int compare(Ticket t1, Ticket t2) {

        // ПРОВЕРКА ВОЗРАСТА ПО ВРЕМЕНИ
        if (isPensionerTime) {
            // Если у обоих клиентов пенсионный возраст, то проверка переходит на проверку услуг
            if (!(howOld(t1) >= 65 && howOld(t2) >= 65))
                if (howOld(t1) >= 65)
                    return -1;
                else if (howOld(t2) >= 65)
                    return 1;
        }

        // ПРОВЕРКА УСЛУГ
        // Если у обоих клиентов приоритетные услуги, то проверка переходит на проверку номеров тикета
        if (!(isPriorityService(t1) && isPriorityService(t2))) {
            if (isPriorityService(t1))
                return -1;
            else if (isPriorityService(t2))
                return 1;
        }


        // ПРОВЕРКА НОМЕРОВ ТИКЕТА
        return Integer.compare(t1.getTicketNum(), t2.getTicketNum());
    }

    private boolean isPriorityService(Ticket ticket) {
        return ticket.getService() == Services.OPENING_DEPOSIT || ticket.getService() == Services.INVESTING_FUNDS;
    }

    private int howOld(Ticket ticket) {
        return BankApp.YEAR - ticket.getBirthYear();
    }

}
