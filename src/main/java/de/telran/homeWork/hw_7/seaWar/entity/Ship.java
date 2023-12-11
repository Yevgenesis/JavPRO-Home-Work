package de.telran.homeWork.hw_7.seaWar.entity;

public class Ship {
    private static int id;
    int shipId;
    int decks;
    int damages;
    String cover = "██";

    public Ship(int decks) {
        id++;
        this.shipId = id;
        if (decks < 1) decks = 1;
        if (decks > 5) decks = 5;
        this.decks = decks;
    }

    public boolean isDestroyed(){
        return damages == decks;
    }

    @Override
    public String toString() {
        return "Ship Id=" + shipId +
                ", Decks=" + decks +
                ", Damages=" + damages +
                '\n';
    }

    public void addDamage(){
        if (!isDestroyed()) damages++;
    }
}
