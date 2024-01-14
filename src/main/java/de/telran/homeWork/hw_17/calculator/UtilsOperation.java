package de.telran.homeWork.hw_17.calculator;

public class UtilsOperation {


    //Прибавление
    public <T extends Number> T add(T arg1, T arg2) {
        return (T) Double.valueOf(arg1.doubleValue() + arg2.doubleValue());
    }

    //вычитание
    public <T extends Number> T sub(T arg1, T arg2) {
        return (T) Double.valueOf(arg1.doubleValue() - arg2.doubleValue());
    }

    //умножение
    public <T extends Number> T mult(T arg1, T arg2) {
        return (T) Double.valueOf(arg1.doubleValue() * arg2.doubleValue());
    }

    //деление
    public <T extends Number, U extends Double> U div(T arg1, T arg2) {

        if (arg2.doubleValue() == 0) {
            System.out.print("На ноль делить нельзя! ");
        }
        return (U) Double.valueOf(arg1.doubleValue() / arg2.doubleValue());

    }

    //получение квадрата
    public <T extends Number> T sqr(T arg1) {
        return (T) Double.valueOf(Math.pow(arg1.intValue(), 2));
    }
}
