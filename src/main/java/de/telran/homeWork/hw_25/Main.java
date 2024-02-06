package de.telran.homeWork.hw_25;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    // На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
// Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
// но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения переменной isHit и больше его не меняли.
// Как только мишень разрушена кем то из стрелков, соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.
    public static void main(String[] args) {
        // Без использования синхронизатора получилось только так
        // я не понял как можно заблокировать стрелков используя только AtomicBoolean
        ShootingTournament[] shooters = new ShootingTournament[5];

        for (int i = 0; i < shooters.length; i++) {
            shooters[i] = new ShootingTournament("Стрелок " + (i + 1));
            new Thread(shooters[i]).start();
        }
        ShootingTournament.isHit.set(true);
    }
}

class ShootingTournament implements Runnable {
    static final AtomicBoolean isHit = new AtomicBoolean(false);

    private final String shooterName;

    ShootingTournament(String name) {
        this.shooterName = name;
    }

    @Override
    public void run() {
        while (!isHit.get()) {
            if (isHit.getAndSet(new Random().nextBoolean())) {
                System.out.println(shooterName + " попал в мишень!");
                break;
            } else {
                System.out.println(shooterName + " промахнулся.");

            }

        }
    }
}