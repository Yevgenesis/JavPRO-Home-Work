package de.telran.homeWork.hw_11.bank;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    private static int id;

    private int ticketNum;
    private String fuelName;
    private int BirthYear;
    private Services service;

    public Ticket(String fuelName, int BirthYear, Services service) {
        id++;
        this.ticketNum = id;
        this.fuelName = fuelName;
        this.service = service;
        this.BirthYear = BirthYear;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNum=" + ticketNum +
                ", fuelName='" + fuelName + '\'' +
                ", BirthYear=" + BirthYear +
                ", YearOld=" + (2023 - BirthYear) +
                ", service=" + service +
                '}';
    }
}


