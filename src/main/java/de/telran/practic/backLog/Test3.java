package de.telran.practic.backLog;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30, 3, 5);

        stack.unShift(1, 2, 3);
        stack.shift();
//stack.shift();
        System.out.println(stack);

    }
}

class MyStack {
    public int[] arr = new int[0];

    public int pop() {
        if (isEmpty()) throw new Error("Pop is blocked! Array is empty");
        int lastElement = arr[arr.length - 1];
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return lastElement;
    }

    public int shift() {
        int firstElement = arr[0];
        arr = Arrays.copyOfRange(arr, 1, arr.length);
        return firstElement;
    }

    public int unShift(int... x) {
        int[] newArr = new int[arr.length + x.length];

        System.arraycopy(x, 0, newArr, 0, x.length);
        for (int j = x.length, y = 0; j < newArr.length; j++) {
            newArr[j] = arr[y++];
        }
        this.arr = newArr;
        return arr.length;
    }


    public boolean hasElement(int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return true;
        }
        return false;
    }

    public int findMax() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public int findMin() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }


    public int getLength() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }


    public int push(int... x) {
        int[] newArr = new int[arr.length + x.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        for (int j = arr.length, y = 0; j < newArr.length; j++) {
            newArr[j] = x[y++];
        }
        this.arr = newArr;
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}