package de.telran.homeWork.hw_17.calculator;

public class UtilsOperation<T extends Number, U extends Number> {

    //Прибавление
    public T add(T arg1, T arg2) {
        if (arg1 instanceof Integer) {
            return (T) Integer.valueOf(arg1.intValue() + arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() + arg2.doubleValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() + arg2.longValue());
        } else {
            return null;
        }
    }

    //вычитание
    public T sub(T arg1, T arg2) {
        if (arg1 instanceof Integer) {
            return (T) Integer.valueOf(arg1.intValue() - arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() - arg2.doubleValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() - arg2.longValue());
        } else {
            return null;
        }
    }

    //умножение
    public T mult(T arg1, T arg2) {
        if (arg1 instanceof Integer) {
            return (T) Integer.valueOf(arg1.intValue() * arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() * arg2.doubleValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() * arg2.longValue());
        } else {
            return null;
        }
    }

    //деление
    public U div(T arg1, T arg2) {
        if (arg1 instanceof Integer) {
            return (U) Double.valueOf((double) arg1.intValue() / (double) arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (U) Double.valueOf(arg1.doubleValue() / arg2.doubleValue());
        } else if (arg1 instanceof Long) {
            return (U) Double.valueOf(arg1.longValue() / arg2.longValue());
        } else {
            return null;
        }
    }

    //получение квадрата
    public T sqr(T arg1) {
        if (arg1 instanceof Integer) {
            return (T) Double.valueOf(Math.pow(arg1.intValue(), 2));
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(Math.pow(arg1.doubleValue(), 2));
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf((long) Math.pow(arg1.longValue(), 2));
        } else {
            return null;
        }
    }
}
