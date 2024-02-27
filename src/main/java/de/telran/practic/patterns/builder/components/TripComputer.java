package de.telran.practic.patterns.builder.components;

import de.telran.practic.patterns.builder.cars.Car;

public class TripComputer {
    private Car car;

    public void showFuel() {
        System.out.println("Fuel level -> " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isOn()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is not started");
        }
    }

    public void setCar(Car car) {
        this.car = car;
    }
}