package de.telran.homeWork.hw_26.xorExchange;


public class Main {
    public static void main(String[] args) {


        int a = 16;
        int b = 19;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


//        int x = 16;
//        int y = 19;
//        System.out.println("x(" + x + ") = " + Integer.toBinaryString(x));
        System.out.println("a(" + a + ") = " + Integer.toBinaryString(a));
        System.out.println("b(" + b + ") = " + Integer.toBinaryString(b));

        a = a ^ b;
        System.out.println(Integer.toBinaryString(a));
        b = a ^ b;
        System.out.println(Integer.toBinaryString(b));

    }
}
