package de.telran.homeWork.hw_6.logistics.transports;

public class TravelAgency {
    Transport[] transports = {
            new Train(90, 3),
            new Bus(80, 1.5),
            new Airplane(833, 5)};

    public Transport getOptimalTransport(double distance) {

        Transport optimalTransport = transports[0];
        for (Transport transport : transports) {
            if (optimalTransport.calcDistanceWeight(distance) > transport.calcDistanceWeight(distance)) {
                optimalTransport = transport;
            }
        }
        return optimalTransport;
    }

}
