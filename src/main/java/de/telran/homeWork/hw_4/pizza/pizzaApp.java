package de.telran.homeWork.hw_4.pizza;

public class pizzaApp {
    /*
Вы работаете в пиццерии.
Клиент у Вас может заказать пиццу различных размеров и различных форм: квадратную, круглую, треугольную.
Напишите методы для вычисления калорийности заказанной пиццы, если например кв.см. пиццы имеет 40 калорий.
Попробуйте решить данную задачу через перегрузку методов.
    */
    public static void main(String[] args) {
        PizzaCalculator pizzaCalc = new PizzaCalculator();

        pizzaCalc.getCalories(5);
        pizzaCalc.getCalories(5, 6);
        pizzaCalc.getCalories(5, 6, 7);

    }
}
