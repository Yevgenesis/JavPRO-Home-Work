package de.telran.homeWork.hw_12.gasStation;


import lombok.Getter;

import java.util.Objects;

@Getter
public class Transport implements Comparable<Transport> {
    private static int id = 7700;
    private final int number;
    private final Auto type;

    public Transport(Auto type) {
        this.number = id;
        id++;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return type == transport.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return " \nNumber=" + number +
                "\ntype=" + type +
                '\n';
    }


    @Override
    public int compareTo(Transport o) {
        if (this.getType() == Auto.AMBULANCE) return -1;
        else if (o.getType() == Auto.AMBULANCE) return 1;
        else return 0;
    }
}
