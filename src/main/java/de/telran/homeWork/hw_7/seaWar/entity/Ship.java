package de.telran.homeWork.hw_7.seaWar.entity;

public class Ship {
    int decks;
    int damages;

    public Ship(int decks) {
        this.decks = decks;
    }

    public boolean isDestroyed(){
        return damages == decks;
    }

    public void addDamage(){
        damages++;
    }
}
