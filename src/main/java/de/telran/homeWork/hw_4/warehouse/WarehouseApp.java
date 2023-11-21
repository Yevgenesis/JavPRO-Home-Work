package de.telran.homeWork.hw_4.warehouse;

import de.telran.homeWork.hw_4.warehouse.interfaces.Collector;
import de.telran.homeWork.hw_4.warehouse.interfaces.Loader;
import de.telran.homeWork.hw_4.warehouse.interfaces.Storekeeper;
import de.telran.homeWork.hw_4.warehouse.interfaces.Warehouse;

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

        Collector collector = warehouse;
        Loader loader = warehouse;
        Storekeeper storekeeper = warehouse;

    }
}
