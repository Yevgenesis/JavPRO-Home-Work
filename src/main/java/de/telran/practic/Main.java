package de.telran.practic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = {0,1};
       int[] ss = {2,3,4,5};

        System.out.println(Arrays.toString(arr));
        arr = ss;
        System.out.println(Arrays.toString(arr));

    }
}



