package de.telran.practic.abstracts;

import de.telran.practic.abstracts.asus.AsusSetFactory;
import de.telran.practic.abstracts.hp.HewlettPackardSetFactory;

public class Main {
    public static void main(String[] args) {
        SetCreator asus = new SetCreator(new AsusSetFactory(), "ASUS");
        System.out.println(asus);

        SetCreator hp = new SetCreator(new HewlettPackardSetFactory(), "Hewlett Packard");
        System.out.println(hp);
    }
}


