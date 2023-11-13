package de.telran.homeWork.hw_2.transports;

public class Bus extends Auto{
    int seatingNumbers;

    public Bus(String brandName, int numbersOfDoors, int seatingNumbers) {
        super(brandName, numbersOfDoors);
        this.seatingNumbers = seatingNumbers;
    }
}
