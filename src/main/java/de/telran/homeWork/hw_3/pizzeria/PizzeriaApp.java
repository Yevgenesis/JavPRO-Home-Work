package de.telran.homeWork.hw_3.pizzeria;

import de.telran.homeWork.hw_3.pizzeria.interfaces.Cashier;
import de.telran.homeWork.hw_3.pizzeria.interfaces.Cleaner;
import de.telran.homeWork.hw_3.pizzeria.interfaces.Cook;
import de.telran.homeWork.hw_3.pizzeria.interfaces.Waiter;

public class PizzeriaApp {
    public static void main(String[] args) {
        Pizzeria myPizzeria = new Pizzeria();

        Cashier cashier = myPizzeria;
        Waiter waiter = myPizzeria;
        Cleaner cleaner = myPizzeria;
        Cook cook = myPizzeria;

    }
}
