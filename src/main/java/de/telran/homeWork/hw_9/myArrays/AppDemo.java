package de.telran.homeWork.hw_9.myArrays;

import de.telran.homeWork.hw_7.dynamicArray.DynamicIntArray;
import de.telran.homeWork.hw_8.uniDirectionIntLinkedList.UniDirectionalIntLinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppDemo {
    public static void main(String[] args) {
//  1 - UniDirectionalIntLinkedList
        UniIterLinkedList myLinkedList = new UniIterLinkedList();
        myLinkedList.add(11);
        myLinkedList.add(13);
        myLinkedList.add(111);
        myLinkedList.add(131);

        Iterator<Integer> arrIter = myLinkedList.iterator();
        System.out.println("LinkedList Iterator");
        while (arrIter.hasNext()){
            System.out.println(arrIter.next());
        }

//  2 - DynamicIntArray

        IterDynamicArray myArr = new IterDynamicArray();
        myArr.add(2);
        myArr.add(11);
        myArr.add(13);
        Iterator<Integer> arrIter2 = myArr.iterator();
        System.out.println("DynamicArray Iterator");

        while (arrIter2.hasNext()){
            System.out.println(arrIter2.next());
        }


//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,67));





    }
}
