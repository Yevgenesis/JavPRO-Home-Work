package de.telran.homeWork.hw_7.seaWar.entity;

public class UserAI implements User{
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
