package de.telran.homeWork.hw_2.animals;

public class Lion extends Tiger{
    String maneColor; // цвет гривы

    public Lion(int age, String breed, String maneColor) {
        super(age, breed);
        this.maneColor = maneColor;
    }
}
