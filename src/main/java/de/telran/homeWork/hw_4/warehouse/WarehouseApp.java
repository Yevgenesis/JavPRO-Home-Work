package de.telran.homeWork.hw_4.warehouse;

import de.telran.homeWork.hw_4.warehouse.interfaces.Collector;
import de.telran.homeWork.hw_4.warehouse.interfaces.Loader;
import de.telran.homeWork.hw_4.warehouse.interfaces.Storekeeper;

/*
Вы работаете на складе.
Когда приезжает товар, у вас:
Грузчик: Разгружает товар, Загружает товар.
Кладовщик: Принимает товар, отпускает товар, определяет место (ячейку) для хранения товара,
формирует задание на сборку товара со склада, Формирует задание на размещение товара на складе.
Сборщик: Размещает товар на складе, Собирает товар на складе.
Реализовать складскую работу на складе, согласно вышеуказанного поведения.
*/
public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        ((Collector) warehouse).placesGoods();
        ((Collector) warehouse).collectsGoods();

        ((Loader) warehouse).loadGoods();
        ((Loader) warehouse).unloadsGoods();

        ((Storekeeper) warehouse).createTaskForPickingGoods();
        ((Storekeeper) warehouse).createTaskForPlacingGoods();
        ((Storekeeper) warehouse).determinePlaceForGoods();
        ((Storekeeper) warehouse).receiveGoods();
        ((Storekeeper) warehouse).releaseGoods();
    }
}
