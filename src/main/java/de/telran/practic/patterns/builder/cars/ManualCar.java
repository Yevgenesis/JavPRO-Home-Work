package de.telran.practic.patterns.builder.cars;

import de.telran.practic.patterns.builder.components.Engine;
import de.telran.practic.patterns.builder.components.GPSNavigator;
import de.telran.practic.patterns.builder.components.Transmission;
import de.telran.practic.patterns.builder.components.TripComputer;

public class ManualCar {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final int seats;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public ManualCar(CarType carType, Engine engine, Transmission transmission, int seats, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", seats=" + seats +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}