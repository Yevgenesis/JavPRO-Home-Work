package de.telran.practic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 1, 0};

        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            }
        }
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.printf(Arrays.toString(arr));
    }
}
