package de.telran;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,-9,33,8,-10,5};

        int minEl = arr[0];
        int smallestEl = arr[0];
        for (int j : arr) {
            if (minEl > j) {
                minEl = j;
            }
            if (minEl < smallestEl) {
                smallestEl = minEl;
            }
        }
        System.out.println(minEl);
        System.out.println(smallestEl);
    }
}