package de.telran.homeWork.hw_27.tasks;

public class Test4 {
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
