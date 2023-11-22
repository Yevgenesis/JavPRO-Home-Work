package de.telran.homeWork.hw_4.hensFactory.entity;

class PolishHen extends Hen {
    private String country = "Польша";

    @Override
    public String getDescription() {
        return "Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яйца в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        // Тут должен быть расчёт яиц
        return 22;
    }
}
