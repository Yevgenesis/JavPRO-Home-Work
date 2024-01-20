package de.telran.practic.maxIsland;

public class BoardManager {
    private int maxIsland;
    private int currentIslandCapacity;
    final private int[][] board;


    public BoardManager(int[][] board) {
        this.board = board;
        this.maxIsland = 0;
    }

    public int getMaxIsland() {
        for (int row = 0; row < this.board.length; row++) {
            for (int col = 0; col < this.board[row].length; col++) {
                if (this.board[row][col] == 1) {
                    currentIslandCapacity = 0;
                    calculateNearPoints(row, col);
                    if (currentIslandCapacity > this.maxIsland)
                        this.maxIsland = currentIslandCapacity;
                }
            }
        }
        return this.maxIsland;
    }

    private void calculateNearPoints(int row, int col) {
        this.board[row][col] = 2;
        this.currentIslandCapacity++;

        // UP
        if (row > 0 && this.board[row - 1][col] == 1)
            calculateNearPoints(row - 1, col);

        // RIGHT
        if (col < 9 && this.board[row][col + 1] == 1)
            calculateNearPoints(row, col + 1);

        // DOWN
        if (row < 9 && this.board[row + 1][col] == 1)
            calculateNearPoints(row + 1, col);

        // LEFT
        if (col > 0 && this.board[row][col - 1] == 1)
            calculateNearPoints(row, col - 1);
    }

    public void printBoard() {
        for (int[] row : this.board) {
            for (int point : row) {
                System.out.print(point == 0 ? ". " : "X ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max capacity: " + "\u001B[31m" + maxIsland + " \u001B[0m");
    }
}
