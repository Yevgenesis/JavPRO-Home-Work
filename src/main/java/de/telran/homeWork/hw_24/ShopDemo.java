package de.telran.homeWork.hw_24;

public class ShopDemo {
    /*
 Есть Магазин, на котором может одновременно разместиться ограниченное количество товара (для примера можно взять 3 единицы,
а лучше попросить пользователя ввести количество). За один раз Поставщик может привезти 1 шт. товара.
Покупатель тоже может приобрести только 1 шт. товара.
Напишите программу, которая позволит Покупателям приобретать товар и нужно сделать так, чтобы полки магазина не пустовали ;)
Используйте wait / notify механизм многопоточности. Поставщик и Покупатель/ли - это разные потоки.*/
    public static void main(String[] args) {
        int productsStoreCapacity = 3;
        Store store = new Store(productsStoreCapacity);
        Shipper shipper = new Shipper(store);
        Bayer bayer = new Bayer(store);
        new Thread(shipper).start();
        new Thread(bayer).start();
        new Thread(bayer).start();
        new Thread(bayer).start();
    }
}

class Store {
    private int product = 0;
    private final int capacity;

    public Store(int capacity) {
        this.capacity = capacity;
    }

    public void getProduct() {

        synchronized (this) {
            while (product < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на полках: " + product);
            notify();
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void put() {
        while (product >= this.capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Поставщик добавил 1 товар");
        System.out.println("Товаров на полках: " + product);
        notify();
    }

}

class Shipper implements Runnable {

    Store store;

    Shipper(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}

class Bayer implements Runnable {

    Store store;

    Bayer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.getProduct();
        }
    }
}
