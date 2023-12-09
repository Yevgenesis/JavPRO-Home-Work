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


    public static final int YEAR = 2023;

    public static void main(String[] args) {
        SortedSet<Ticket> queueTicket = new TreeSet<>(new TicketComparator());

        Ticket n1 = new Ticket("Ivanov A.I.", 1990, Services.COUNSELING);
        Ticket n2 = new Ticket("Petrov V.V.", 1985, Services.INVESTING_FUNDS);
        Ticket n3 = new Ticket("Sidorov M.G.", 1995, Services.OPENING_DEPOSIT);
        Ticket n4 = new Ticket("Mahmudov G.G.", 1958, Services.UTILITY_PAYMENTS);
        Ticket n5 = new Ticket("Lee B.B.", 1990, Services.OPENING_DEPOSIT);

        queueTicket.addAll(Arrays.asList(n1, n2, n3, n4, n5));

        printQueue(queueTicket);

        // Если наступает время обслуживания клиентов для вложения средств или открытие депозита.
        // Пересчитываем порядок очереди, с включённой сортировкой для компаратора, по приоритетным услугам
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
    private boolean isServiceTime;

    public TicketComparator(boolean isServiceTime) {
        this.isServiceTime = isServiceTime;
    }

    public TicketComparator() {
    }

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int t1_years = BankApp.YEAR - t1.getBirthYear();
        int t2_years = BankApp.YEAR - t2.getBirthYear();

// ПРОВЕРКА ВОЗРАСТА
// Если у обоих клиентов пенсионный возраст, то проверка переходит на проверку услуг
        if (!(t1_years >= 65 && t2_years >= 65))
            if (t1_years >= 65)
                return -1;
            else if (t2_years >= 65)
                return 1;

// ПРОВЕРКА УСЛУГ ПО ВРЕМЕНИ
        if (isServiceTime) {
// Если у обоих приоритетные услуги, то проверка переходит на проверку номеров тикета
            if (!(isPriorityService(t1) && isPriorityService(t2))) {
                if (isPriorityService(t1))
                    return -1;
                else if (isPriorityService(t2))
                    return 1;
            }
        }

// ПРОВЕРКА НОМЕРОВ БИЛЕТА
        if (t1.getTicketNum() > t2.getTicketNum())
            return 1;
        else if (t1.getTicketNum() < t2.getTicketNum())
            return -1;
        return 0;
    }

    private boolean isPriorityService(Ticket ticket) {
        return ticket.getService() == Services.OPENING_DEPOSIT || ticket.getService() == Services.INVESTING_FUNDS;
    }

}
