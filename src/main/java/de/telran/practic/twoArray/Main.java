package de.telran.practic.twoArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        int[] mergedArray = mergeSortedArrays(nums1, nums2);

        if (mergedArray.length % 2 != 0) {
            System.out.println(mergedArray[mergedArray.length/2]);
        }else {
            System.out.println((mergedArray[mergedArray.length/2] + mergedArray[mergedArray.length/2-1])/2.0);

        }

        System.out.println(Arrays.toString(mergedArray));
    }

    static int[] mergeSortedArrays(int[] num1, int[] num2) {
        int len2 = num2.length;
        int len1 = num1.length;
        int len = len1 + len2;
        int[] array = new int[len];
        while (len != 0) {
            if (len2 != 0 && len1 != 0) {
                if (num1[len1 - 1] > num2[len2 - 1]) {
                    array[--len] = num1[--len1];
                } else {
                    array[--len] = num2[--len2];
                }
            } else if (len1 != 0) {
                array[--len] = num1[--len1];
            } else {
                array[--len] = num2[--len2];
            }
        }
        return array;
    }
}
