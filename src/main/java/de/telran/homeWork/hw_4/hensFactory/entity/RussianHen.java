package de.telran.homeWork.hw_4.hensFactory.entity;

class RussianHen extends Hen {
    private String country = "Россия";

    @Override
    public String getDescription() {
        return "Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яйца в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 22;
    }
}
