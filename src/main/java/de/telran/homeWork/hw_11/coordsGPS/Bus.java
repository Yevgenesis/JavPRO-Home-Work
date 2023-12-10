package de.telran.homeWork.hw_11.coordsGPS;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Setter
@Getter
public class Bus {
    private static int id = 3300;

    private int transportNumber;
    private int routNumber;

    @Getter
    private double[] gpsCoords = new double[2];

    public Bus(int routNumber) {
        this.transportNumber = id;
        id++;
        this.routNumber = routNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return transportNumber == bus.transportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportNumber);
    }


    @Override
    public String toString() {
        return "\nBusNumber=" + transportNumber +
                "\nroutNumber=" + routNumber +
                "\ngpsCoords=" + Arrays.toString(gpsCoords) +
                '\n';
    }
}
