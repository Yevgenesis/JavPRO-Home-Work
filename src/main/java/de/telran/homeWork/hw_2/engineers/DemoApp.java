package de.telran.homeWork.hw_2.engineers;

public class DemoApp {
    public static void main(String[] args) {
/*
1.  Создай классы: Землянин, Человек, Сотрудник, Инженер
    Построй правильную цепочку наследования классов.
    Характеристики и поведение - на свое усмотрение.*/

        Engineer designer = new Engineer(33, "Adam", "+380985674321","Construction-engineer");
        Engineer builder = new Engineer(26, "Eva", "+380662344332","Design-engineer");
        designer.startWorking();
        builder.celebrateBirthday();

    }
}

