package de.telran.practic.quiclSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 9, 1, 10, 4, 11, 0, 7);
        quickSort(arr,0,arr.size());
        System.out.println(arr);

    }

    private static void quickSort(List<Integer> arr,int start, int end) {
        if (start >= end) return;

        int pivot = arr.get(end-1);
        int opora=start;

        for (int i=start;i<end;i++){
            if (pivot<arr.get(i)) {
                switchEl(arr, opora, i);
                opora++;
            }
        }
        switchEl(arr,pivot,opora);
        opora++;
//        quickSort(arr,opora,end);



    }

    private static void switchEl(List<Integer> arr, int opora, int ind) {
        int temp = arr.get(opora);
        arr.set(opora,arr.get(ind));
        arr.set(ind,temp);
    }

}
