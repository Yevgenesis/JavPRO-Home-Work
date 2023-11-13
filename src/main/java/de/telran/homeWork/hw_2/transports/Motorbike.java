package de.telran.homeWork.hw_2.transports;

public class Motorbike extends Bicycle {
    double enginePower;

    public Motorbike(String brandName, int numberOfSpeeds, double enginePower) {
        super(brandName, numberOfSpeeds);
        this.enginePower = enginePower;
    }
}
