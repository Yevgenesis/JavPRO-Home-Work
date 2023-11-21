package de.telran.homeWork.hw_4.hensFactory.entity;

public class HenFactory {
    public static Hen getHen(String country) {
        return switch (country.toLowerCase()) {
            case "russia" -> new RussianHen();
            case "moldova" -> new MoldovanHen();
            case "belarus" -> new BelarusianHen();
            // В любой непонятной ситуации производим Украинских кур:-)
            default -> new UkrainianHen();
        };
    }
}
