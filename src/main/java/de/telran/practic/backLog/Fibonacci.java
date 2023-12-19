package de.telran.practic.backLog;

public class Fibonacci {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 7, 9, 10, 35, 67, 89};
        int num = 35;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binaryRecSearch(arr, num, start, end));
    }

//    public static int binarySearch(int[] arr, int num) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (end >= start) {
//            int mid = (start + end) / 2;
//            if (num > arr[mid]) {
//                start = mid + 1;
//            } else if (num < arr[mid]) {
//                end = mid - 1;
//            } else return mid;
//        }
//        return -1;
//    }

    public static int binaryRecSearch(int[] arr, int num, int start, int end) {

        if (end < start) return -1;
        int mid = (start + end) / 2;
        if (num > arr[mid]) {
            return binaryRecSearch(arr, num, mid + 1, end);
        } else if (num < arr[mid]) {
            return binaryRecSearch(arr, num, start, end - 1);
        } else return mid;
    }
}

//    public static int getFibNumber(int ind) {
//        if (ind < 0) throw new Error("the number should be positive");
//        int fibA = -1;
//        int fibB = 1;
//        int res = 0;
//        for (int i = 1; i <= ind; i++) {
//            res = fibA + fibB;
//            fibA = fibB;
//            fibB = res;
//        }
//        return res;
//    }

//    public static int fib(int n) {
//        if (n < 0) throw new Error("the number should be positive");
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        return fib(n - 1) + fib(n - 2);
//    }

