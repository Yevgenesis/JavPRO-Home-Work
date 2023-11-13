package de.telran.homeWork.hw_2.transports;

public class Auto extends Transport {
    int numbersOfDoors;

    public Auto(String brandName, int numbersOfDoors) {
        super(brandName);
        this.numbersOfDoors = numbersOfDoors;
    }
}
