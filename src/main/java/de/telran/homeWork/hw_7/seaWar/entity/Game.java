package de.telran.homeWork.hw_7.seaWar.entity;

public class Game {
    Board userBoard;
    Board computerBoard;

    public Game() {
        userBoard = new Board();
        computerBoard = new Board();
    }
}
