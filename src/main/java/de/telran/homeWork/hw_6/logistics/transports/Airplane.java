package de.telran.homeWork.hw_6.logistics.transports;

public class Airplane implements Transport {

    protected double speedKmH; // скорость Километров в час
    protected double costPerKm; // цена 1-го километра в евро
    public Airplane(double speedKmH, double costPerKm) {
        this.costPerKm = costPerKm;
        this.speedKmH = speedKmH;
    }

    @Override
    public double calcDistanceWeight(double distance){
        double travelCost = distance * costPerKm;
        double travelTime = distance / speedKmH;
        return  travelCost / travelTime;
    }

    @Override
    public void startTheJourney(double distance) {
        System.out.println("Your are going on a trip by Airplane");
        System.out.println("Distance: " + distance);
    }
}
