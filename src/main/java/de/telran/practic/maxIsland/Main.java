package de.telran.practic.maxIsland;


public class Main {
    public static void main(String[] args) {

        BoardManagerWithColor boardManager = new BoardManagerWithColor(10, 10);
        boardManager.getMaxIsland();
        boardManager.printBoard();

    }
}


