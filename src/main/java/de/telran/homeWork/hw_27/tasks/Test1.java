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


class Test2 {
    // Этот таск выведет ссылку на массив
    // Но внутри массива значения поменяются на [2,4,6]
    public static void main(String[] args) {
        final int[] array = {1, 2, 3};
        new Object() {
            void add() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] * 2;
                }
            }
        }.add();
        System.out.println(array);
    }
}


class Test3 {
    // Тут сам себя вызывает постоянно
    // стек переполнится
    private final Test3 test3 = new Test3();


    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }


    private boolean test() {
        return (Boolean) null;
    }
}


class Test4 {
    // Пройдёт по всем исключениям и выведет в консоль
    // RuntimeException и 1
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new NullPointerException();
        } finally {
            throw new RuntimeException("1");
        }
    }
}

