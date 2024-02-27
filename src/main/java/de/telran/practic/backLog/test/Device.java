package de.telran.practic.backLog.test;

public abstract class Device implements Movable {
    @Override
    public void moveLeft() {
        System.out.println("Our Device move left");
    }

}
