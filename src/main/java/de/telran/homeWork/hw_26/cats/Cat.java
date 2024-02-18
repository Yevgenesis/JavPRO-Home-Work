package de.telran.homeWork.hw_26.cats;


import lombok.Getter;
import lombok.Setter;

public class Cat implements Cloneable {
    @Getter
    private static int catsCount;
    @Getter
    @Setter
    private double minWeight;
    @Getter
    @Setter
    private double maxWeight;
    @Getter
    @Setter
    private int eyeQuantity = 2;
    @Getter
    @Setter
    private ColorCoat color;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private boolean isLive = true;
    @Getter
    private int feedSum;
    private int meowCount;
    private double weight;

    public Cat(String name, double weightKg, int eyeQuantity, ColorCoat color, double minWeight, double maxWeight) {
        catsCount++;
        this.isLive = true;
        this.name = name;
        this.weight = weightKg;
        this.eyeQuantity = eyeQuantity;
        this.color = color;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Cat(double weight) {
        this.minWeight = 0.1;
        this.weight = weight;
        this.maxWeight = weight + 20; // Максимальный вес (по умолчанию) +15 кг от начального веса
        this.eyeQuantity = 2;// 2 глаза по умолчанию
    }

    public void sayMeow() {
        if (isLive) {
            System.out.println(name + " мяукает!");
            meowCount++;
            if (meowCount == 4) { // Максимальное кол-во мяуканий
                System.out.println("Но это был последний раз. Замяукали до смерти((('");
                isLive = false;
                catsCount--;
            }
        } else {
            System.out.println("Не может мяукать, " + name + " - R.I.P!");
        }
    }

    public void feedCat(int foodGram) {
        if (isLive) {
            feedSum += foodGram;
            weight += foodGram / 1000.0;
            System.out.println(name + " кушает " + foodGram + " грамм корма!");
            if (weight > maxWeight) {
                System.out.println("ВЗРЫВ!!! Перекормили до смерти! " + name + " - R.I.P!");
                isLive = false;
                catsCount--;
            }
        } else {
            System.out.println("Нельзя кормить, " + name + " - R.I.P!");
        }
    }

    public double getWeight() {
        return Math.round(weight * 100.0) / 100.0;
    }


    public void pee() {
        if (isLive) {
            System.out.println(name + " в туалете, сидит на лотке...");
            weight -= 0.15; // вес одного испражнения
            if (weight < minWeight) {
                System.out.println("С таким маленьким весом не живут! " + name + " - R.I.P!");
                isLive = false;
                catsCount--;
            }
        } else {
            System.out.println(name + " не может ходить в туалет потому,что R.I.P!");
        }
    }

    @Override
    protected Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\nГлаза: " + eyeQuantity + " шт." +
                "\nЦвет: " + color +
                "\nВес: " + getWeight() + " кг" +
                "\nЖивой: " + isLive + "\n";
    }
}
