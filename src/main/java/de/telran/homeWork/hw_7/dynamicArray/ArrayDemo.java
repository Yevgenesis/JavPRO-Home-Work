package de.telran.homeWork.hw_7.dynamicArray;

public class ArrayDemo {
    public static void main(String[] args) {
        DynamicIntArray myArr = new DynamicIntArray();
        System.out.println(myArr);
        myArr.add(2);
        System.out.println(myArr);
        myArr.add(11);
        System.out.println(myArr);
        myArr.add(12);
        System.out.println(myArr);
        myArr.add(13);
        System.out.println(myArr);
        myArr.add(new int[]{9,8,7,6,5,4,5});
        System.out.println(myArr);

        myArr.add(13);
        System.out.println(myArr);

        myArr.add(15);
        System.out.println(myArr);
        myArr.add(16);
        System.out.println(myArr);

        myArr.delete(11);
        System.out.println(myArr);

        System.out.println(myArr.get(1));



    }
}
