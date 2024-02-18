package de.telran.practic.quiclSort;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 9, -5, 6, -2, -10, 9, 12, 1, -2};

        int sumEnd = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxSum < maxSum + arr[i]) {
                maxSum += arr[i];
            } else {
                if (sumEnd < maxSum) sumEnd = maxSum;
                maxSum = arr[i];
            }
        }
        System.out.println(sumEnd);
    }
}



