package de.telran.homeWork.module_1.hw1.module1.lecture1.module1.lecture1;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println(name + " звонит!");
    }

    String getNumber() {
        return number;
    }
}
