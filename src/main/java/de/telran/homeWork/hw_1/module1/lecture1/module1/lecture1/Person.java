package de.telran.homeWork.hw_1.module1.lecture1.module1.lecture1;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void move() {
        System.out.println(fullName + " двигается");
    }


    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
