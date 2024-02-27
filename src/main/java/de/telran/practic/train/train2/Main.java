package de.telran.practic.train.train2;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(10);
        System.out.println(train.root.next);
    }
}

class Wagon {
    int value;
    Wagon next;

    Wagon(int value) {
        this.value = value;
        this.next = null;
    }
}

class Train {
    Wagon root;

    Train(int value) {
        this.root = new Wagon(value);
    }
}