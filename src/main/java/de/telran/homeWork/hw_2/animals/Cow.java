package de.telran.homeWork.hw_2.animals;

public class Cow extends Pet{
    private double wight;

    public Cow(int age, String breed, String owner, String name, double wight) {
        super(age, breed, owner, name);
        this.wight = wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getWight() {
        return wight;
    }
}
