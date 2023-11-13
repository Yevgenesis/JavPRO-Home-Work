package de.telran.homeWork.hw_2.transports;

public class DemoApp {
    public static void main(String[] args) {
/* Есть классы Транспортное средство, Автомобиль, Автобус, Велосипед, Мотоцикл.
   Построй правильную цепочку наследование классов на Java.
   Характеристики и поведение - на свое усмотрение.*/
        Auto car = new Auto("BMW", 4);
        Bus bus = new Bus("Mersedes",3, 41);
        Bicycle  bicycle = new Bicycle("Gian",4);
        Motorbike  motorbike = new Motorbike("Yamaha",6,198);

    }
}
