package de.telran.homeWork.hw_5.cofeeMachine;

public class CoffeeApp {
    /*
    У вас на работе есть один кофейный автомат. Он умеет готовить различные виды кофе. Но он только один.
    Реализуйте класс кофейного автомата, с помощью которого любой человек может приготовить себе различные варианты кофе.
    Но что важно, сколько ко бы раз не обращался человек за изготовлением кофе, или какие бы люди не пытались

    Приготовить кофе, они всегда получали бы ссылку на один и тот же объект кофейного автомата.
    (Поищите информацию в интернете о паттерне Singleton и попытайтесь его реализовать при решении данной задачи.
    Можно использовать вариант реализации со статическим методом и приватным конструктором,
    или вариант реализации через Enum.)
    */
    public static void main(String[] args) {
        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        machine1.makeCoffee(CoffeeMachine.Coffee.ESPRESSO);

        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        machine2.makeCoffee(CoffeeMachine.Coffee.LATE);

    }
}
