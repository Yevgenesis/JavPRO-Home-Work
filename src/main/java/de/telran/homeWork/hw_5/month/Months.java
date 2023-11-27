package de.telran.homeWork.hw_5.month;

public enum Months {
    DECEMBER("Декабрь"),
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь");

    private String title;

    Months(String title) {
        this.title = title;
    }

    public String getMonth() {
        return title;
    }
}
