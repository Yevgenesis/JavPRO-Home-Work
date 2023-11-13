package de.telran.homeWork.hw_2.engineers;

public class Earthling {
    private int daysLived;

    public Earthling(int daysLived) {
        this.daysLived = daysLived;
    }

    public void increaseAge(int daysLived) {
        this.daysLived += daysLived;
    }

    public int getLifeDays() {
        return daysLived;
    }
}
