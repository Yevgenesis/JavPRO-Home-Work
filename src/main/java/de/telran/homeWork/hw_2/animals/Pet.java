package de.telran.homeWork.hw_2.animals;

public class Pet extends Animal{
    String owner;
    String name;

    public Pet(int age, String breed, String owner, String name) {
        super(age, breed);
        this.owner = owner;
        this.name = name;
    }
}
