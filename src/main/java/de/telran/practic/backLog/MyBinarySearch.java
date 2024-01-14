package de.telran.practic.backLog;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] mas = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(getIndex(mas, 0, mas.length, 20));
    }

    public static int getIndex(int[] mas, int start, int end, int n) {
        int current = (end - start) / 2 + start;
        if (n == mas[current]) return current;
        else if (n > mas[current]) {
            start = current + 1;
            return getIndex(mas, start, end, n);
        } else if (n < mas[current]) {
            end = current - 1;
            return getIndex(mas, start, end, n);
        } else {
            return -1;
        }
    }
}
