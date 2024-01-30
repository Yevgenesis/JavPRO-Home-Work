package de.telran.homeWork.hw_23.numsOfThread;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное введенной цифре,
    нумеруете их и запускаете на выполнение. Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100
    миллисекунд перед каждым выводом. Сделайте так, чтобы главный поток выполнения программы не завершился до окончания
    работы всех дочерних потоков.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        Thread[] threadArr = new Thread[num];
        for (int i = 0; i < num; i++) {
            threadArr[i] = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println("цикл №" + j + " - " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            threadArr[i].start();
        }

        for (Thread thread : threadArr) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Программа завершена!");

    }
}
