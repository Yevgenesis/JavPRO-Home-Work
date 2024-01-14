package de.telran.practic.backLog;

class LoopTest {
    int k = 5;

    public boolean checkIt(int k) {
        return k-- > 0;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k);
        }
    }

    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}