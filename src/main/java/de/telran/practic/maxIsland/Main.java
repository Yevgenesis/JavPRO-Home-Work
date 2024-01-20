package de.telran.practic.maxIsland;


public class Main {
    public static void main(String[] args) {

        BoardManager2 boardManager = new BoardManager2(10, 10);
        boardManager.getMaxIsland();
        boardManager.printBoard();

    }
}


