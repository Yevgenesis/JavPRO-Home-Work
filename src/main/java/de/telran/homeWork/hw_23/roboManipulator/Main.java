package de.telran.homeWork.hw_23.roboManipulator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    У вас есть стол, на который один робоманипулятор ложит деталь, а второй забирает эту деталь забирает.
    Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь
    и только тогда ложить следующую. Постройте программу, которая автоматизирует эту работу.
    Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.*/
    public static void main(String[] args) {
        int detailQuantity = 5;
        List<Detail> table = new ArrayList<>();

        RobotSetter setter = new RobotSetter(table, detailQuantity);
        RobotGetter getter = new RobotGetter(table, detailQuantity);
        Thread tr1 = new Thread(setter);
        Thread tr2 = new Thread(getter);
        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Конец рабочего дня!");
    }
}


class Detail {
    private static int id;
    private final int num;

    public Detail() {
        this.num = ++id;
    }

    public int getNum() {
        return num;
    }
}


class RobotSetter implements Runnable {

    private final List<Detail> table;
    private int detailQuantity;

    public RobotSetter(List<Detail> table, int detailQuantity) {
        this.table = table;
        this.detailQuantity = detailQuantity;
    }

    @Override
    public void run() {
        while (this.detailQuantity != 0) {
            while (table.isEmpty()) {
                synchronized (table) {
                    Detail currentDetail = new Detail();
                    table.add(currentDetail);
                    System.out.println("Робот Сеттер положил деталь №" + currentDetail.getNum());
                    this.detailQuantity--;
                }
            }
        }
    }
}


class RobotGetter implements Runnable {
    private final List<Detail> table;
    private int detailQuantity;

    public RobotGetter(List<Detail> table, int detailQuantity) {
        this.table = table;
        this.detailQuantity = detailQuantity;
    }

    @Override
    public void run() {
        while (this.detailQuantity != 0) {
            while (table.size() == 1) {
                synchronized (table) {
                    Detail currentDetail = table.getLast();
                    table.removeFirst();
                    System.out.println("Робот Геттер взял деталь №" + currentDetail.getNum());
                    this.detailQuantity--;
                }
            }
        }
    }
}
