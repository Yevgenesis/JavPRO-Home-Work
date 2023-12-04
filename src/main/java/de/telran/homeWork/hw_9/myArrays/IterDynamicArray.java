package de.telran.homeWork.hw_9.myArrays;

import de.telran.homeWork.hw_7.dynamicArray.DynamicIntArray;

import java.util.Iterator;

public class IterDynamicArray  extends DynamicIntArray implements Iterator {

//  Наследовался от класса DynamicIntArray, имплементировал интерфейс Iterator,
//  добавил метод Итератор и переопределил методы

    private int cursor = -1;


    public IterDynamicArray iterator(){
        return this;
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