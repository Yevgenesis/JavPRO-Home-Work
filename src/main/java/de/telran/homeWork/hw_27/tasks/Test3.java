package de.telran.homeWork.hw_27.tasks;

public class Test3 {
    // Тут сам себя вызывает постоянно
    // и стек переполнится
    private final Test3 test3 = new Test3();


    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }


    private boolean test() {
        return (Boolean) null;
    }
}
