package de.telran.homeWork.hw_11.restaurant;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Kitchen {
    private final LinkedHashSet<Order> orders = new LinkedHashSet<>();
    private Iterator<Order> iterator;

    public void addOrders(Order... orders) {
        this.orders.addAll(List.of(orders));
        if (iterator == null) {
            iterator = this.orders.iterator();
        }
    }

    public boolean isOrderPresent() {
        return iterator.hasNext();
    }

    public Order getOrder() {
        return iterator.next();
    }


}
