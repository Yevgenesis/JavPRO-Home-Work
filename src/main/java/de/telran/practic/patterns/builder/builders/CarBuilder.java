//package de.telran.practic.patterns.builder.builders;
//
//import de.telran.homeWork.hw_3.toys.Car;
//import de.telran.practic.patterns.builder.cars.CarType;
//import de.telran.practic.patterns.builder.components.*;
//
//public class CarBuilder implements Builder {
//    private CarType carType;
//    private Engine engine;
//    private Transmission transmission;
//    private int seats;
//    private TripComputer tripComputer;
//    private GPSNavigator gpsNavigator;
//
//
//
//    @Override
//    public void setCarType(CarType carType) {
//        this.carType = carType;
//
//    }
//
//    @Override
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//
//    }
//
//    @Override
//    public void setTransmission(Transmission transmission) {
//        this.transmission = transmission;
//
//    }
//
//    @Override
//    public void setSids(int sids) {
//
//    }
//
//    @Override
//    public void setSeats(int seats) {
//        this.seats = seats;
//
//    }
//
//    @Override
//    public void setTripComputer(TripComputer tripComputer) {
//        this.tripComputer = tripComputer;
//
//    }
//
//    @Override
//    public void setGPSNavigator(GPSNavigator gpsNavigator) {
//        this.gpsNavigator = gpsNavigator;
//
//    }
//
//    public Car getCar(){
//        return new Car(carType,engine,transmission,seats,tripComputer,gpsNavigator);
//    }
//}