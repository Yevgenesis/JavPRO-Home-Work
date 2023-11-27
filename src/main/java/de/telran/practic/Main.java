package de.telran.practic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 11, 15, 16},
                {9, 12, 17, 21},
                {13, 15, 18, 26},
                {35, 38, 45, 66},
                {78, 89, 99, 100}};

        int n = 18;
        System.out.println("["+getNum(n, array)+"]");

    }

    public static int getNum(int n, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (n <= array[i][array[i].length-1]) {
                System.out.print("array["+i+"]");
                return Arrays.binarySearch(array[i], 0, array[i].length - 1, n);
            }
        }
        return -1;
    }
}



