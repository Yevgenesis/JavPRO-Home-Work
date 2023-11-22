package de.telran.homeWork.hw_4.hensFactory.entity;

class BelarusianHen extends Hen {

    private String country = "Белоруссия";

    @Override
    public String getDescription() {
        return "Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        // Тут должен быть расчёт яиц
        return 20;
    }
}
