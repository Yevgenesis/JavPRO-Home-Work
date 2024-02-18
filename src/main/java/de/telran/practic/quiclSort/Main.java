package de.telran.practic.quiclSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 9, 1, 8, 4, 8, 0, 7);
        System.out.println(quickSort(arr));
    }

    private static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < pivot) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        ArrayList<Integer> newArray = new ArrayList<>();

        newArray.addAll(quickSort(left));
        newArray.add(pivot);
        newArray.addAll(quickSort(right));

        return newArray;
    }
}
