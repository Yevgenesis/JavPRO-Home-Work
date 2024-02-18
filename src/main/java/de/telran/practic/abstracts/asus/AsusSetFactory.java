package de.telran.practic.abstracts.asus;

import de.telran.practic.abstracts.abstractEntity.*;
import de.telran.practic.abstracts.hp.HpKeyboard;
import de.telran.practic.abstracts.hp.HpMonitor;
import de.telran.practic.abstracts.hp.HpSystemBox;

public class AsusSetFactory implements AbstractFactory {

    @Override
    public AbstractMonitor createMonitor() {
        System.out.println("Create Asus Monitor......");
        return new HpMonitor();
    }

    @Override
    public AbstractLabel createLabel() {
        return null;
    }

    @Override
    public AbstractSystemBox createSystemBox() {
        System.out.println("Create Asus Computer......");
        return new HpSystemBox();
    }

    @Override
    public AbstractKeyboard createKeyboard() {
        System.out.println("Create Asus Keyboard......");
        return new HpKeyboard();
    }
}

