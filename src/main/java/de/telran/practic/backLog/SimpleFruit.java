package de.telran.practic.backLog;

public class SimpleFruit {
    public static void main(String[] args) {

    Fruit fruit = new Fruit();
    fruit.setColor("white");
    fruit.setSugar(16);
    fruit.setVitamins(new String[]{"A","B","C"});
    System.out.println(fruit);

    Ananas ananas = new Ananas();
    ananas.country = "Urugvai";
        System.out.println(ananas);


}
}
