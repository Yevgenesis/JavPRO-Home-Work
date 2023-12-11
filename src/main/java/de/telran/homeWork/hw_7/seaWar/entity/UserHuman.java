package de.telran.homeWork.hw_7.seaWar.entity;

import java.util.ArrayList;

public class UserHuman implements User {

    String name;

    public ArrayList<Ship> ships;

    public UserHuman(String name, int[] shipsDecks) {
        this.name = name;
        addNewShips(shipsDecks);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", ships=" + ships +
                '\n';
    }

    @Override
    public int[] getFireCoords() {
        return new int[0];
    }

    @Override
    public int[] getShipCoords() {
        return new int[0];
    }

    @Override
    public boolean getShipDirection() {
        return false;
    }

    public void addNewShips(int[] shipsDecks) {
        ships = new ArrayList<>();
        for (int decks : shipsDecks) {
            Ship ship = new Ship(decks);
            ships.add(ship); // добавить юзеру корабль
        }
    }
}
