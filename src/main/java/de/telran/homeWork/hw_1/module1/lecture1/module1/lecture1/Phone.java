package de.telran.homeWork.hw_1.module1.lecture1.module1.lecture1;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " звонит!");
    }

    public String getNumber() {
        return number;
    }
}
