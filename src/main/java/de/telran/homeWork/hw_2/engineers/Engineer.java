package de.telran.homeWork.hw_2.engineers;

public class Engineer extends Employee {

    public String jobPositions;

    public Engineer(int age, String name, String phoneNumber, String jobPositions) {
        super(age, name, phoneNumber);
        this.jobPositions = jobPositions;
    }

    public void startWorking() {
        System.out.println(jobPositions + " " + name + " started working!");
    }
}
