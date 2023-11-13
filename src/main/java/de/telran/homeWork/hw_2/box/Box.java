package de.telran.homeWork.hw_2.box;

public class Box {
    private double height;
    private double width;
    private double length;

    private double volume; // Объём в см^3

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
        volume = width * length * height;
    }

    public void countQuantityByVolume(double itemCentimetersCubed) {
        /* Рассчитать количество коробок, чтобы разместить объем сыпучего товара в см^3 */
        double quantity = itemCentimetersCubed / volume;
        System.out.println(itemCentimetersCubed+" кубических см. Поместится в " + (int) Math.ceil(quantity) + " коробки");
    }

    public void getVolume() {
        System.out.println("Объём коробки: " + volume + " cm^3");
    }

    public void showBoxSize() {
        System.out.println("Размер коробки: ");
        System.out.println("Длинна: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
    }
}
