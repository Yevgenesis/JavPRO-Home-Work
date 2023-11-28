package de.telran.homeWork.hw_7.dynamicArray;

public class ArrayDemo {
    public static void main(String[] args) {
        DynamicIntArray myArr = new DynamicIntArray(1);
        System.out.println(myArr);

        myArr.add(2);
        myArr.add(11);
        System.out.println(myArr);

        myArr.add(new int[]{9,8,7,6,5,4,5});
        System.out.println(myArr);

        myArr.delete(1);
        System.out.println(myArr);

        System.out.println(myArr.get(1));






    }
}
