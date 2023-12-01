package de.telran.homeWork.hw_7.seaWar;

import de.telran.homeWork.hw_7.seaWar.entity.Board;

public class SeaWarGame {
    public static void main(String[] args) {
        Board userBoard = new Board();
        Board coputerBoard = new Board();

        boolean isSettingShip = userBoard.setShip(3,6,4,false);
        userBoard.showBoard(true);
        System.out.println(isSettingShip);

        isSettingShip = userBoard.setShip(1,4,4,true);
        userBoard.showBoard(true);
        System.out.println(isSettingShip);

    }
}
