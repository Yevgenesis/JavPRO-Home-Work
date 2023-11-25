package de.telran.homeWork.hw_5.cofeeMachine;

public class CoffeeMachine {
    private static CoffeeMachine instance;

    private CoffeeMachine() {
    }

    public static CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    void makeCoffee(Coffee coffee) {
        System.out.println("Возьмите Ваш " + coffee);
    }

    enum Coffee {
        ESPRESSO,
        CAPPUCCINO,
        LATE;
    }

}
