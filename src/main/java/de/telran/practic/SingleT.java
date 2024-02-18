package de.telran.practic;

public class SingleT {
    static SingleT instance;

    private SingleT() {
    }

    public static SingleT init() {
        if (instance == null) {
            instance = new SingleT();
        }
        return instance;
    }

    public void printStr(String str) {
        System.out.println(str);
    }
}
