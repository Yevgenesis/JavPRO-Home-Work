package de.telran.practic.patterns.builder.builders;

import de.telran.practic.patterns.builder.cars.CarType;
import de.telran.practic.patterns.builder.cars.ManualCar;
import de.telran.practic.patterns.builder.components.Engine;
import de.telran.practic.patterns.builder.components.GPSNavigator;
import de.telran.practic.patterns.builder.components.Transmission;
import de.telran.practic.patterns.builder.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;

    }

    public ManualCar getCar() {
        return new ManualCar(carType, engine, transmission, seats, tripComputer, gpsNavigator);
    }
}