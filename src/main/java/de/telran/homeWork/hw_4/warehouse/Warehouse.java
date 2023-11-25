package de.telran.homeWork.hw_4.warehouse;

import de.telran.homeWork.hw_4.warehouse.interfaces.Collector;
import de.telran.homeWork.hw_4.warehouse.interfaces.Loader;
import de.telran.homeWork.hw_4.warehouse.interfaces.Storekeeper;

public class Warehouse implements Collector, Loader, Storekeeper {
    @Override
    public void collectsGoods() {
        System.out.println("Собрал товар на складе");
    }

    @Override
    public void placesGoods() {
        System.out.println("Разместил товар на складе");
    }

    @Override
    public void loadGoods() {
        System.out.println("Загрузил товар");

    }

    @Override
    public void unloadsGoods() {
        System.out.println("Разгрузил товар");

    }

    @Override
    public void receiveGoods() {
        System.out.println("Получил товар");

    }

    @Override
    public void releaseGoods() {
        System.out.println("Отпустил товар");

    }

    @Override
    public void determinePlaceForGoods() {
        System.out.println("Определил место для товара");
    }

    @Override
    public void createTaskForPickingGoods() {
        System.out.println("Сформировал задание на сборку товара");

    }

    @Override
    public void createTaskForPlacingGoods() {
        System.out.println("Сформировал задание на размещение товара");
    }
}
