package de.telran.homeWork.hw_2.animals;

public class Orangutan extends Monkey{
    private String furColor; // цвет меха

    public Orangutan(int age, String breed, String furColor) {
        super(age, breed);
        this.furColor = furColor;
    }
}
