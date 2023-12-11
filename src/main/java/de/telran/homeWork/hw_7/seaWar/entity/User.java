package de.telran.homeWork.hw_7.seaWar.entity;

import java.util.ArrayList;

public interface User {
    ArrayList<Ship> ships = new ArrayList<>();
    int[] getFireCoords();

    int[] getShipCoords();

    boolean getShipDirection();

    void addNewShips(int[] shipsDecks);
}
