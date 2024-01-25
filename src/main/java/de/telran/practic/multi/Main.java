package de.telran.practic.multi;

import lombok.Getter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MyThread tr1 = new MyThread(arr, 0, arr.length / 2);
        MyThread tr2 = new MyThread(arr, arr.length / 2, arr.length);

        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(tr1.getSum() + tr2.getSum());

    }
}

@Getter
class MyThread extends Thread {
    private final int[] arr;
    private int sum;
    private final int start;
    private final int end;

    public MyThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = this.start; i < this.end; i++) {
            this.sum += arr[i];
        }
    }
}



