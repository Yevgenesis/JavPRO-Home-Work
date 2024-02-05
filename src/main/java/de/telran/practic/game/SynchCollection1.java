package de.telran.practic.game;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

/**
 * - класс который содержит метод для генерации 10 экшонов лист
 * - необходимо что бы сыграли 10 игроков каждый с каждым короме самого себя естественно
 * - победа 1 бал, ничья 0,5, проигрыш 0
 * - после всех игр записать в какую нить структуру данных у кого сколько баллов
 * - найти первые 3 лидирующих балла
 * - если у лидеров одинаковые баллы то они переигрывают между собой столько пока не определить тройка лидеров
 * - вывести тройку лидеров и таблицу всех участников
 */
public class SynchCollection1 {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        Randomize rndActions = new Randomize(10);

        new Player(FAKER.name().firstName(), rndActions.getActionsArray(), exchanger);
        new Player(FAKER.name().firstName(), rndActions.getActionsArray(), exchanger);
    }
}

enum Action {
    PAPER,
    STONE,
    SCISSORS
}

class Player extends Thread {
    private final String name;
    private final List<Action> actions;
    private final Exchanger<Action> exchanger;

    public Player(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    public void getWinner(Action actionP1, Action actionP2) {
        if (actionP1 == Action.STONE && actionP2 == Action.SCISSORS ||
                actionP1 == Action.PAPER && actionP2 == Action.STONE ||
                actionP1 == Action.SCISSORS && actionP2 == Action.PAPER) {
            System.out.println("WINNER: " + name);
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action ac : actions) {
            try {
                reply = exchanger.exchange(ac);
                getWinner(ac, reply);
                sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Randomize extends Random {
    private final int turns;

    public Randomize(int turns) {
        this.turns = turns;
    }

    public List<Action> getActionsArray() {
        List<Action> actions = new ArrayList<>();
        Action[] turnsName = Action.values();
        for (int i = 0; i < this.turns; i++) {
            actions.add(turnsName[this.nextInt(turnsName.length)]);
        }
        return actions;
    }
}