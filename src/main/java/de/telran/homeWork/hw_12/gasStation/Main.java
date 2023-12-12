package de.telran.homeWork.hw_12.gasStation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    /*
     Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO.
    Но автомобили скорой помощи всегда заправляются вне очереди. В час пик, общественные автобусы
    получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
     Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб
    заправляется вне очереди. Какую бы коллекцию Вы использовали для реализации данного алгоритма?
    Напишите программу, которая бы имитировала работу.*/
    public static void main(String[] args) {

        // Обычный режим времени, скорая помощь в приоритете
        PriorityQueue<Transport> gasStation = new PriorityQueue<>();

        gasStation.add(new Transport(Auto.CAR));
        gasStation.add(new Transport(Auto.BUS));
        gasStation.add(new Transport(Auto.SERVICES));
        gasStation.add(new Transport(Auto.AMBULANCE));

        System.out.println("Обычный режим времени");
        printQueue(gasStation);


        // Режим стихийных бедствий, транспорт городских служб в приоритете
        gasStation = new PriorityQueue<>(new TransportComparator(Times.CATASTROPHES));

        gasStation.add(new Transport(Auto.CAR));
        gasStation.add(new Transport(Auto.BUS));
        gasStation.add(new Transport(Auto.SERVICES));
        gasStation.add(new Transport(Auto.AMBULANCE));

        System.out.println("Режим стихийных бедствий");
        printQueue(gasStation);


        // Режим час пик, скорая помощь в приоритете
        gasStation = new PriorityQueue<>(new TransportComparator(Times.RUSH_HOUR));

        gasStation.add(new Transport(Auto.CAR));
        gasStation.add(new Transport(Auto.BUS));
        gasStation.add(new Transport(Auto.SERVICES));
        gasStation.add(new Transport(Auto.AMBULANCE));

        System.out.println("Режим час пик");
        printQueue(gasStation);


    }

    public static void printQueue(PriorityQueue<Transport> gasStation) {
        while (!gasStation.isEmpty()) {
            System.out.println(gasStation.poll());
        }
    }
}

class TransportComparator implements Comparator<Transport> {
    Times times;

    public TransportComparator(Times times) {
        this.times = times;
    }

    @Override
    public int compare(Transport o1, Transport o2) {

        switch (this.times) {
            // Если время стихийных бедствий
            case CATASTROPHES:
                if (o1.getType() == Auto.SERVICES) return -1;
                if (o2.getType() == Auto.SERVICES) return 1;
                break;

            // Если час пик
            case RUSH_HOUR:
                if (o1.getType() == Auto.AMBULANCE) return -1;
                if (o2.getType() == Auto.AMBULANCE) return 1;
                if (o1.getType() == Auto.BUS) return -1;
                if (o2.getType() == Auto.BUS) return 1;
                break;
        }
        return 0;
    }
}



