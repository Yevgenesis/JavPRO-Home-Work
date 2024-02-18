package de.telran.practic.abstracts.hp;

import de.telran.practic.abstracts.abstractEntity.*;

public class HewlettPackardSetFactory implements AbstractFactory {
    @Override
    public AbstractMonitor createMonitor() {
        System.out.println("Create Hewlett Packard Monitor......");
        return new HpMonitor();
    }

    @Override
    public AbstractLabel createLabel() {
        return null;
    }

    @Override
    public AbstractSystemBox createSystemBox() {
        System.out.println("Create Hewlett Packard Computer......");
        return new HpSystemBox();
    }

    @Override
    public AbstractKeyboard createKeyboard() {
        System.out.println("Create Hewlett Packard Keyboard......");
        return new HpKeyboard();
    }
}
