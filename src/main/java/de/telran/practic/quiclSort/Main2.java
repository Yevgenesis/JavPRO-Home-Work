package de.telran.practic.quiclSort;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {6, 7, 1, 2, 9, 8, 3, 0, 10, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static int arrange(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start) return;
        int index = arrange(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }
}
