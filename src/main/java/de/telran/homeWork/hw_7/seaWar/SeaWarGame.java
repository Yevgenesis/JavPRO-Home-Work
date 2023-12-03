package de.telran.homeWork.hw_7.seaWar;

import de.telran.homeWork.hw_7.seaWar.entity.Board;
import de.telran.homeWork.hw_7.seaWar.entity.Game;
import de.telran.homeWork.hw_7.seaWar.entity.User;
import de.telran.homeWork.hw_7.seaWar.entity.UserHuman;

public class SeaWarGame {
    public static void main(String[] args) {
        UserHuman user1 = new UserHuman("Vano");
        UserHuman user2 = new UserHuman("Liza");
        Game game = new Game(user1,user2);



        game.showBoards(true);
//        game.setShips(user1);

//        isSettingShip = userBoard.setShip(2,4,4,false);
//        userBoard.showBoard(true);
//        System.out.println(isSettingShip);

    }
}
