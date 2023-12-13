package de.telran.practic.backLog;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    exChangeElements(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void exChangeElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
