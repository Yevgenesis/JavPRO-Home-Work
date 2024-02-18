package de.telran.practic.quiclSort;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 4, 0, 3, 6, 4, 7, 2));
        quickSort(arr, 0, arr.size() - 1);
        System.out.println(arr);
    }

    private static int getIndex(List<Integer> arr, int start, int end) {
        int pivot = arr.get(end);
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr.get(i) < pivot) {
                switchEl(arr, index, i);
                index++;
            }

        }
        switchEl(arr, index, end);
        return index;

    }

    private static void switchEl(List<Integer> arr, int opora, int ind) {
        int temp = arr.get(opora);
        arr.set(opora, arr.get(ind));
        arr.set(ind, temp);
    }

    private static void quickSort(List<Integer> arr, int start, int end) {
        if (end <= start) return;
        int index = getIndex(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }
}
