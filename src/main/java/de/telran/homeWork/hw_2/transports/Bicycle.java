package de.telran.homeWork.hw_2.transports;

public class Bicycle extends Transport{
    int numberOfSpeeds;

    public Bicycle(String brandName, int numberOfSpeeds) {
        super(brandName);
        this.numberOfSpeeds = numberOfSpeeds;
    }
}
