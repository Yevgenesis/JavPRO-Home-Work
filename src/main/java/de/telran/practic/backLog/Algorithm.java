package de.telran.practic.backLog;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {

        int[] arr = {60, 30, 10, 30, 20, 100, 50};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));

        }


//        System.out.println(Arrays.toString(arr));


//showSum(arr, 50);


    }

    public static int getMinOrMaxElement(int[] arr, boolean isMax) {
        int result = arr[0];
        for (int num : arr) {
            if (isMax) result = num > result ? result = num : result;
            else result = num < result ? result = num : result;
        }
        return result;
    }

    public static void showSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
                }
            }
        }
    }
}