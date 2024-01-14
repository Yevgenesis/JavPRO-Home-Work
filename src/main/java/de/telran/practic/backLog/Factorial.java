package de.telran.practic.backLog;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(getFactorial(n));

        int n = 6;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);

    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return n;
        }
        return n + getFactorial(n - 1);
    }

}