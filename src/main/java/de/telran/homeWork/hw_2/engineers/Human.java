package de.telran.homeWork.hw_2.engineers;

public class Human extends Earthling {
    protected String name;

    public Human(int age, String name) {
        super(age * 365);
        this.name = name;
    }

    public void startEating() {
        System.out.println(name + " started eating!");
    }

    public void celebrateBirthday() {
        super.increaseAge(365);
        System.out.println("Happy Birthday " + name + ", you are now " + getAge() + " years old!");
    }

    public int getAge() {
        return super.getLifeDays() / 365;
    }
}
