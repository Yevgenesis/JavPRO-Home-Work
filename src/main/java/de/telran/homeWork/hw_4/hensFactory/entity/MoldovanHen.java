package de.telran.homeWork.hw_4.hensFactory.entity;

class MoldovanHen extends Hen {
    private String country = "Молдавия";

    @Override
    public String getDescription() {
        return "Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 18;
    }
}
