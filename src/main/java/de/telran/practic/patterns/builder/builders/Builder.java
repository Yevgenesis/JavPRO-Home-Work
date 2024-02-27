package de.telran.practic.patterns.builder.builders;

import de.telran.practic.patterns.builder.cars.CarType;
import de.telran.practic.patterns.builder.components.Engine;
import de.telran.practic.patterns.builder.components.GPSNavigator;
import de.telran.practic.patterns.builder.components.Transmission;
import de.telran.practic.patterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setSeats(int seats);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}