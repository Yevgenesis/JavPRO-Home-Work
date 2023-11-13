package de.telran.practic.inheritance;

public class Animal {
    int age;
    int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println("Nyam-nyam");
    }
}
