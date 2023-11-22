package de.telran.homeWork.hw_4.pizza;

public class PizzaCalculator {

    private final int CALORIES = 40;

    public void getCalories(double diameter) {
        System.out.println("Круглая пицца: " + diameter);
        System.out.println("Калории: " + Math.round(Math.PI * Math.pow(diameter/2, 2) * CALORIES));
        System.out.println();
    }

    public void getCalories(double squareSideA , double squareSideB) {
        System.out.println("Прямоугольная пицца: " + squareSideA + " на " + squareSideB);
        System.out.println("Калории: " + Math.round(squareSideA * squareSideB * CALORIES));
        System.out.println();
    }

    public void getCalories(double triangleSideA, double triangleSideB, double triangleSideC) {
        double s = (triangleSideA + triangleSideB + triangleSideC) / 2;
        double area = Math.sqrt(s * (s - triangleSideA) * (s - triangleSideB) * (s - triangleSideC));
        System.out.println("Треугольная пицца: " + triangleSideA + " на " + triangleSideB + " на " + triangleSideC);
        System.out.println("Калории: " + Math.round(area * CALORIES));
        System.out.println();
    }
}
