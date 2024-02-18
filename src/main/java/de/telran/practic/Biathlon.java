package de.telran.practic;

import java.util.concurrent.atomic.AtomicBoolean;

public class Biathlon {
    public static void main(String[] args) {

        AtomicBoolean isHit = new AtomicBoolean(false);
        int playerCount = 5;
        Thread[] players = new Thread[playerCount];

        for (int i = 0; i < playerCount; i++) {
            players[i] = new Thread(() -> {

                if (isHit.compareAndSet(false, true)) {
                    System.out.println(Thread.currentThread().getName() + " попал в мишень!" +
                            "Мишень разрушена!!!");

                } else {
                    System.out.println(Thread.currentThread().getName() + " не попал в мишень");
                }
            }, "Игрок " + (i + 1));
        }
        for (int i = 0; i < playerCount; i++) {
            players[i].start();

        }

    }

}
