package de.telran.homeWork.hw_2.engineers;

public class Employee extends Human{

    String phoneNumber;

    public Employee(int age, String name, String phoneNumber) {
        super(age, name);
        this.phoneNumber = phoneNumber;
    }

}
