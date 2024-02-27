package de.telran.homeWork.hw_27.tasks;

public class Test1 {
    // 2 - Этот блок вызовется вторым и будет вызываться каждый раз при создании объекта

    {
        System.out.println("2");
    }

    // 1 - Статик вызовется первым и только при первом создании класса
    static {
        System.out.println("1");
    }

    // 3 - Конструктор вызовется третьим и будет вызываться каждый раз при создании объекта

    public Test1() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new Test1();
        new Test1();
        // ответ: 1 2 3 2 3
    }
}


