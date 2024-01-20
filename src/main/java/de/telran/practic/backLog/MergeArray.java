package de.telran.practic.backLog;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 10};
        int[] arr2 = {2, 4, 7, 8, 11, 13, 14};

        int[] arr3 = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];

        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < newSize; i++) {
            if (ind2 != arr2.length && ind1 != arr1.length) {
                if (arr1[ind1] > arr2[ind2]) {
                    mergedArr[i] = arr2[ind2];
                    ind2++;
                } else {
                    mergedArr[i] = arr1[ind1];
                    ind1++;
                }
            } else if (ind2 != arr2.length) {
                mergedArr[i] = arr2[ind2];
                ind2++;
            } else {
                mergedArr[i] = arr1[ind1];
                ind1++;
            }
        }
        return mergedArr;
    }
}
