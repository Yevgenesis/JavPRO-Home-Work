package de.telran.homeWork.module_1.hw1.module1.lecture1.module1.lecture1;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    void move() {
        System.out.println(fullName + " двигается");
    }


    void talk() {
        System.out.println(fullName + " говорит");
    }
}
