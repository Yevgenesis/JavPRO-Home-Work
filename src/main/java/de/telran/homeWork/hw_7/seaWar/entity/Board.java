package de.telran.homeWork.hw_7.seaWar.entity;

import java.util.Arrays;
import java.util.Objects;

public class Board {
    String[][] board = new String[10][10];

    public Board() {
        boardInit();
    }

    public void boardInit() {
        for (String[] strings : board) Arrays.fill(strings, "•");
    }

    public void showBoard(boolean isVisibleShips) {
        System.out.println("   A B C D E F G H I J");
        for (int col = 0; col < board.length; col++) {
            System.out.print(col != 9 ? " " + (col + 1) + " " : col + 1 + " ");
            for (int row = 0; row < board[col].length; row++) {
                System.out.print(board[col][row] + " ");
            }
            System.out.println();
        }
    }

    public boolean setShip(int x, int y, int decks, boolean isHorizontal) {
        if (isEmptyPlace(x, y, decks, isHorizontal)) {
            if (isHorizontal) {
                for (int i = y; i < y + decks; i++) board[x][i] = "#";
            } else {
                for (int i = x; i < x + decks; i++) board[i][y] = "#";
            }
                return true;
        }
        return false;
    }

    private boolean isEmptyPlace(int x, int y, int decks, boolean isHorizontal) {
        if (y < 0 || y > 9 || x < 0 || x > 9) return false;
        if (isHorizontal) {
            if (y + decks > 10) return false;
            for (int row = x - 1; row <= x + 1; row++) {
                for (int col = y - 1; col < y + decks + 1; col++) {
                    if (col == -1 || col == 10 || row == -1 || row == 10) continue;
                    if (Objects.equals(board[row][col], "#")) return false;
                    board[row][col] = "-";
                }
            }
        } else {
            if (x + decks > 10) return false;
            for (int col = y - 1; col <= y + 1; col++) {
                for (int row = x - 1; row < x + decks + 1; row++) {
                    if (row == -1 || row == 10 || col == -1 || col == 10) continue;
                    if (Objects.equals(board[row][col], "#")) return false;
                    board[row][col] = "-";
                }
            }
        }
        return true;
    }
}
