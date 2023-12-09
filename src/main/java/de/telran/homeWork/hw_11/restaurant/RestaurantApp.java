package de.telran.homeWork.hw_11.restaurant;

public class RestaurantApp {
/*
    В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами
строго в том порядке, в котором они были переданы на кухню. Создайте множество (Set) заказов,
которые будут передаваться на кухню официантом и реализуйте механизм взятия в работу этих заказом поваром.
Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
Характеристики Order определите самостоятельно.
*/

    public static void main(String[] args) {
        // Блюда нашего ресторана
        Dish d1 = new Dish("Картошка Фри", 4, "Картошка жареная во фритюрнице");
        Dish d2 = new Dish("Салат 'Море'", 4, "Салат из море продуктов");
        Dish d3 = new Dish("Пицца '4 сыра'", 4, "Пицца с четырьмя видами сыра");
        Dish d4 = new Dish("Борщ", 4, "Борщ с пампушками");

        // Формирование заказов
        Order order1 = new Order(3, d2, d4);
        Order order2 = new Order(4, d1, d3);
        Order order3 = new Order(6, d1, d2, d3);

        Kitchen ourKitchen = new Kitchen();

        // Добавление заказов на кухню
        ourKitchen.addOrders(order1, order2, order3);

        // Повар достаёт заказ по очереди, пока есть заказы
        while (ourKitchen.isOrderPresent()) {
            System.out.println(ourKitchen.getOrder());
            // готовит заказ и берёт следующий
        }

    }
}
