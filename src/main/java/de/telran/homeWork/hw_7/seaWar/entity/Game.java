package de.telran.homeWork.hw_7.seaWar.entity;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    String seaColor = Color.BLUE;
    String coordsColor = Color.RED;
    public UserHuman[] users = new UserHuman[2];
    public Board[] boards = {new Board(), new Board()};

    int currenUser;

    public Game(UserHuman user1, UserHuman user2) {
        users[0] = user1;
        users[1] = user2;
    }

    public void showBoards(boolean isVisibleShips) {
        System.out.println(coordsColor + "   A  B  C  D  E  F  G  H  I  J");
        for (int col = 0; col < boards[currenUser].length; col++) {
            System.out.print(coordsColor + (col != 9 ? " " + (col + 1) + " " : col + 1 + " "));
            for (int row = 0; row < boards[currenUser].board[col].length; row++) {
                if (!isVisibleShips || boards[currenUser].board[col][row] == null) {
                    System.out.print(Color.BLUE + "░░" + Color.RESET + " ");
                } else {
                    System.out.print(Color.WHITE + boards[currenUser].board[col][row].cover + Color.RESET + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public UserHuman changeCurrentUser() {
        currenUser = (currenUser + 1) % 2;
        return users[currenUser];
    }

    public void autoSetCurrentUserShips() {
        Random rnd = new Random();
        int cntShip = 0;
        ArrayList<Ship> ships = this.users[currenUser].ships;
        while (cntShip != this.users[currenUser].ships.size()) {
            int x = rnd.nextInt(10);
            int y = rnd.nextInt(10);
            boolean direction = rnd.nextBoolean();
            if (boards[currenUser].setShip(x, y, ships.get(cntShip), direction)) {

            } else if (boards[currenUser].setShip(x, y, ships.get(cntShip), !direction)) {
            } else {
                continue;
            }
            cntShip++;
//            showBoards(true);
        }

    }
}
