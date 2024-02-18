package de.telran.practic.abstracts.abstractEntity;

public interface AbstractFactory {


    AbstractMonitor createMonitor();

    AbstractLabel createLabel();

    AbstractSystemBox createSystemBox();

    AbstractKeyboard createKeyboard();
}
