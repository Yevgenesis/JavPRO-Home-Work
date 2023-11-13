package de.telran.homeWork.hw_2.animals;

public class Animal {
    private int age;
    private String breed;


    public Animal(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void increaseAge() {
        this.age++;
    }
}
