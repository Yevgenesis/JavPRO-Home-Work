package de.telran.homeWork.hw_11.coordsGPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class AppDemo {
    /*
     Вы создаете систему обслуживания городского транспорта,
    которая отслеживает движение автобусов по городу на определенный момент времени.
    У Автобуса обязательные характеристики: номер автобуса, номер транспортного средcтва,
    GPS координаты текущего месторасположения. GPS координаты меняются очень часто при перемещении автобуса.
    Нужно создать Set автобусов, в котором клиенты могут найти быстро нужный номер автобуса
    и получить его текущие GPS координаты. Максимальные требования к Вашей системе - производительность.
    Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
    */
    public static void main(String[] args) {
        Random rnd = new Random();

        Bus a1 = new Bus(165);
        Bus a2 = new Bus(75);
        Bus a3 = new Bus(220);
        Bus a4 = new Bus(9);
        Bus a5 = new Bus(110);

        HashSet<Bus> busNavigator = new HashSet<>(Arrays.asList(a1, a2, a3, a4, a5));

        // Просто для примера. Заполнения произвольными координатами
        for (Bus bus : busNavigator)
            bus.setGpsCoords(new double[]{rnd.nextDouble(181), rnd.nextDouble(181)});

        // Пассажир достаёт нужный автобус по номеру маршрута
        Bus myBus = getBusByRoutNumber(busNavigator, 165);
        System.out.println(myBus);
    }

    public static Bus getBusByRoutNumber(HashSet<Bus> busNavigator, int routNumber) {
        for (Bus bus : busNavigator) {
            if (bus.getRoutNumber() == routNumber) return bus;
        }
        return null;
    }
}
