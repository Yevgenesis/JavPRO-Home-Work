package de.telran.homeWork.hw_27.tasks;

public class Test2 {
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
