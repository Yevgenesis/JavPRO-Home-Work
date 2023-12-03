package de.telran.homeWork.hw_7.seaWar.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    String seaColor = Color.BLUE;
    String coordsColor = Color.YELLOW;
    User[] users = new User[2];
    public Board[] boards = {new Board(), new Board()};

    int currenUser;

    public Game(User user1, User user2) {
        users[0] = user1;
        users[1] = user2;
    }

    public void showBoards(boolean isVisibleShips) {
        System.out.println(coordsColor + "   A  B  C  D  E  F  G  H  I  J");
        for (int col = 0; col < boards[0].length; col++) {
            System.out.print(coordsColor + (col != 9 ? " " + (col + 1) + " " : col + 1 + " "));
            for (int row = 0; row < boards[0].board[col].length; row++) {
                System.out.print(boards[0].board[col][row] + " ");
            }
            System.out.println();
        }
    }

    public void setShips(UserHuman user1) {

    }
}
