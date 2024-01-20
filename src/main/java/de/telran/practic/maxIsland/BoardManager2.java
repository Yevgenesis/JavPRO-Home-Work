package de.telran.practic.maxIsland;

import java.util.Random;

public class BoardManager2 {
    private int numIsland;
    private int maxIsland;
    private int currentIslandCapacity;
    private final int[][] board;


    public BoardManager2(int row, int col) {
        this.board = new int[row][col];
        generateBoard(row, col);
        this.maxIsland = 0;
    }

    public int getMaxIsland() {
        int islandCount = 1;
        for (int row = 0; row < this.board.length; row++) {
            for (int col = 0; col < this.board[row].length; col++) {
                if (this.board[row][col] == 1) {
                    islandCount++;
                    currentIslandCapacity = 0;
                    calculateNearPoints(row, col, islandCount);
                    if (currentIslandCapacity > this.maxIsland) {
                        this.maxIsland = currentIslandCapacity;
                        this.numIsland = islandCount;
                    }
                }
            }
        }
        return this.maxIsland;
    }

    private void calculateNearPoints(int row, int col, int num) {
        board[row][col] = num;
        currentIslandCapacity++;

        // UP
        if (row > 0 && board[row - 1][col] == 1)
            calculateNearPoints(row - 1, col, num);

        // RIGHT
        if (col < board.length - 1 && board[row][col + 1] == 1)
            calculateNearPoints(row, col + 1, num);

        // DOWN
        if (row < board[0].length - 1 && board[row + 1][col] == 1)
            calculateNearPoints(row + 1, col, num);

        // LEFT
        if (col > 0 && board[row][col - 1] == 1)
            calculateNearPoints(row, col - 1, num);
    }

    public void printBoard() {
        for (int[] row : this.board) {
            for (int point : row) {
                System.out.print(point == 0 ? ". " : point == this.numIsland ? "\u001B[31mX \u001B[0m" : "X ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max capacity: " + "\u001B[31m" + maxIsland + " \u001B[0m");
    }

    private void generateBoard(int row, int col) {
        Random random = new Random();
        for (int i = 0; i < row * col / 2; i++)
            this.board[random.nextInt(row)][random.nextInt(col)] = 1;
    }
}
