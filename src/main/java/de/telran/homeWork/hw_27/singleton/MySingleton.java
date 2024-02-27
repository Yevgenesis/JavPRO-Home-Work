package de.telran.homeWork.hw_27.singleton;

public enum MySingleton {
    INSTANCE;
    private String str;

    public void setStr(String s) {
        str = s;
    }

    public void getStr() {
        System.out.println("From My Singleton str: " + str);

    }

}

class Test {
    public static void main(String[] args) {
        MySingleton.INSTANCE.setStr("Test");
        MySingleton.INSTANCE.getStr();

    }

}