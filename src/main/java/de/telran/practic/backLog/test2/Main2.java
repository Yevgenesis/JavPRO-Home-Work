package de.telran.practic.backLog.test2;

public class Main2 {
    public static void main(String[] args) {

        int[] array = {20, 1, 3, 5, 0, 14, -2, -6, 8};
        System.out.println(maxMult(array));

    }

    public static int maxMult(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) mult = mult * arr[i];
        }
        if (mult > 0) return mult;

        int minimum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > minimum) minimum = arr[i];
        }
        return mult / minimum;
    }

}

