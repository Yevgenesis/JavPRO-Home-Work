package de.telran.homeWork.hw_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {
    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    public static int getSecondMinNum(int[] myArray) {
        int minNum = Integer.MAX_VALUE;
        int secondMinNum = Integer.MAX_VALUE;
        for (int num : myArray) {
            if (num < minNum) {
                secondMinNum = minNum;
                minNum = num;
            } else if (num < secondMinNum && num != minNum) {
                secondMinNum = num;
            }
        }
        return secondMinNum;
    }

    public static int getSecondMaxNum(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                secondMaxNum = maxNum;
                maxNum = num;
            } else if (num > secondMaxNum && num != maxNum) {
                secondMaxNum = num;
            }
        }
        return secondMaxNum;
    }

    public static int[] GetCommonArrayElements(int[] array1, int[] array2) {
        List<Integer> arr = new ArrayList<>();
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) arr.add(num1);
            }
        }
        return arr.stream().mapToInt((n) -> n.intValue()).toArray();
    }
}
