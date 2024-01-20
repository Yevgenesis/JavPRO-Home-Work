package de.telran.practic.myExceptions;

import java.util.Scanner;

public class SimpleException {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        System.out.println("Результат = " + 25.0 / value);
        if (value < 0) throw new MyException();
    }
}
