package de.telran.homeWork.hw_4.hensFactory.entity;

public class HenFactory {
    public static Hen getHen(Country country) {
        return switch (country) {
            case POLAND -> new PolishHen();
            case MOLDOVA -> new MoldovanHen();
            case BELARUS -> new BelarusianHen();
            case UKRAINE -> new UkrainianHen();
        };
    }
}
