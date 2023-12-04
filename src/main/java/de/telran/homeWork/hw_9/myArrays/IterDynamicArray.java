package de.telran.homeWork.hw_9.myArrays;

import de.telran.homeWork.hw_7.dynamicArray.DynamicIntArray;

import java.util.Iterator;

public class IterDynamicArray  extends DynamicIntArray implements Iterator {

//  Наследовался от класса DynamicIntArray, имплементировал интерфейс Iterator,
//  добавил метод Итератор и переопределил методы remove

    private int cursor = -1;

    private IterDynamicArray(int[] arr, int len) {
        super(arr, len);
    }

    public IterDynamicArray() {
    }

    public IterDynamicArray iterator(){
        return new IterDynamicArray(arr, length);
    }


    @Override
    public boolean hasNext() {
        if (length == 0 || cursor == length-1) {
            return false;
        }
        return true;
    }



    @Override
    public Integer next() {
        if (hasNext()) {
            return arr[++cursor];
        }
        return -2147483648;
    }

}