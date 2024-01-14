package de.telran.homeWork.hw_17.calculator;

public class Main {
    /*
1. Написать Generic класс для арифметических операций над числами UtilsOperation
    в котором будут представлены методы:
    T add(T arg1, T arg2) //добавление
    T sub(T arg1, T arg2) //вычитание
    T mult(T arg1, T arg2) //умножение
    U div(T arg1, T arg2) //деление
    T sqr(T arg1, T arg2) //получение квадрата
    Показать примеры их использования.
*/
    public static void main(String[] args) {
        UtilsOperation calc1 = new UtilsOperation();
        System.out.println(calc1.add(3L, 2));   //добавление
        System.out.println(calc1.sub(3F, 2));   //вычитание
        System.out.println(calc1.div(30, 0));   //деление
        System.out.println(calc1.mult(3.3, 2)); //умножение
        System.out.println(calc1.sqr(3));  //получение квадрата
    }
}

