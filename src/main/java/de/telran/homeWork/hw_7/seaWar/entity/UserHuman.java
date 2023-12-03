package de.telran.homeWork.hw_7.seaWar.entity;

public class UserHuman implements User{

    String name;

    public UserHuman(String name) {
        this.name = name;
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
}
