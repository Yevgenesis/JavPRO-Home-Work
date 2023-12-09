package de.telran.homeWork.hw_11.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Order {
    int tableNum;
    ArrayList<Dish> dishes = new ArrayList<>(); // массив заказанных блюд

    public Order(int tableNum, Dish... dishes) {
        this.tableNum = tableNum;
        Collections.addAll(this.dishes, dishes);


    }

    public void addToOrder(Dish... dishes) {
        this.dishes.addAll(Arrays.asList(dishes));
    }

    @Override
    public String toString() {
        StringBuilder order = new StringBuilder("\nСтол №" + tableNum);
        for (int i = 0; i < dishes.size(); i++) {
            order.append("\n").append(i + 1).append(" - ").append(dishes.get(i).name).append(" - ").append(dishes.get(i).price).append(" евро");
        }

        return order.toString();
    }
}
