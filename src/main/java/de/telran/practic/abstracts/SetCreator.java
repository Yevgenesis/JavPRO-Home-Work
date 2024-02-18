package de.telran.practic.abstracts;

import de.telran.practic.abstracts.abstractEntity.AbstractFactory;
import de.telran.practic.abstracts.abstractEntity.AbstractKeyboard;
import de.telran.practic.abstracts.abstractEntity.AbstractMonitor;
import de.telran.practic.abstracts.abstractEntity.AbstractSystemBox;

public class SetCreator {
    private final AbstractKeyboard keyboard;
    private final AbstractMonitor monitor;
    private final AbstractSystemBox systemBox;
    private final String brand;

    public SetCreator(AbstractFactory factory, String brand) {
        this.keyboard = factory.createKeyboard();
        this.monitor = factory.createMonitor();
        this.systemBox = factory.createSystemBox();
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "\nSET: " + brand +
                "\nKeyboard: " + keyboard +
                "\nMonitor: " + monitor +
                "\nSystemBox: " + systemBox + "\n";
    }
}
