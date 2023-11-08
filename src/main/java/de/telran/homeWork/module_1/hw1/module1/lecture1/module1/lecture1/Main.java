package de.telran.homeWork.module_1.hw1.module1.lecture1.module1.lecture1;


public class Main {
    public static void main(String[] args) {
/*1. Создать класс module1.lecture1.module1.lecture1.Person, который содержит переменные:
fullName, age; методы move() и talk(), в которых просто вывести на консоль сообщение -
"Такой-то  module1.lecture1.module1.lecture1.Person говорит". Добавьте два конструктора -
module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором
module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)*/

        Person user1 = new Person();
        user1.fullName = "Valera";
        user1.age = 43;
        user1.move();
        user1.talk();

        Person user2 = new Person("Andrey", 23);
        user2.move();
        user2.talk();

/*2. Создать класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.*/

        Phone iphone = new Phone("+38(097)534-62-33", "iPhone 15 PRO", 100);
        Phone samsung = new Phone("+38(066)456-77-22", "Samsung x10", 150);
        Phone motorola = new Phone("+38(050)786-35-11", "Razor v3", 120);


        for (Phone phone : new Phone[]{iphone, samsung, motorola}) {
            System.out.println("number: " + phone.number);
            System.out.println("model: " + phone.model);
            System.out.println("weight: " + phone.weight + " грамм\n");
        }

        iphone.receiveCall(user1.fullName);
        System.out.println(iphone.getNumber() + "\n");

        samsung.receiveCall(user2.fullName);
        System.out.println(samsung.getNumber() + "\n");

        motorola.receiveCall(user1.fullName);
        System.out.println(motorola.getNumber() + "\n");

    }
}
