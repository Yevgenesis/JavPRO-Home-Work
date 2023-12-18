package de.telran.practic.backLog;

public class Main {
    public static void main(String[] args) {
        int ind = 5;
        getFibNumber(ind);
//        System.out.println(getFibNumber(ind));
    }

    public static int getFibNumber(int ind) {
        int fibA = -1;
        int fibB = 1;
        int res = 0;
        for (int i = 0; i <= ind; i++) {
            res = fibA + fibB;
            fibA = fibB;
            fibB = res;
            System.out.println(res);
        }
        return res;
    }
}
