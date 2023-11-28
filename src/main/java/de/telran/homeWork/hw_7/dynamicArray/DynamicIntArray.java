package de.telran.homeWork.hw_7.dynamicArray;

import java.util.Arrays;

public class DynamicIntArray {
    public int PERCENT_CHANGE = 50; // Процент увеличения массива 50%
    public int length;
    private static int DEFAULT_CAPACITY = 5;
    private int capacity;
    private int[] arr = new int[DEFAULT_CAPACITY];

    public DynamicIntArray() {
        this.capacity = DEFAULT_CAPACITY;
    }

    public DynamicIntArray(int capacity) {
        this.capacity = capacity > 0 ? capacity : 1; // защита от значения меньше 1
        arr = new int[this.capacity];
    }

    public void insert(int index, int element) {
        if (isNotOutOfRange(index)) {
            if (capacity == length)
                increaseCapacity();

            for (int i = length; i > index; i--)
                arr[i] = arr[i - 1];

            length++;
            arr[index] = element;
        }
    }

    public void add(int element) {
        if (capacity == length)
            increaseCapacity();

        arr[length] = element;
        length++;
    }

    public void add(int[] arrElements) {
        // Увеличивает capacity до нужного размера
        // В случае большого размера массива лучше было бы
        // сразу посчитать нужный размер
        // Но делал по условию задачи с PERCENT_CHANGE
        while (length + arrElements.length > capacity)
            increaseCapacity();
        for (int element : arrElements)
            arr[length++] = element;
    }

    public int get(int index) {
        if (isNotOutOfRange(index)) {
            return arr[index];
        }
        return 0;
    }

    public int delete(int index) {
        int deletedElement = arr[index];
        for (int i = index; i < length - 1; i++)
            arr[i] = arr[i + 1];

        length--;
        return deletedElement; // Возвращает удалённый элемент
    }

    private void increaseCapacity() {
        // Когда capacity=1 то увеличивает capacity на 100%
        capacity += capacity < 1 ? capacity * PERCENT_CHANGE / 100 : 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < length; i++)
            newArr[i] = arr[i];

        arr = newArr;
    }

    private boolean isNotOutOfRange(int index) {
        if (index >= length) {
            System.out.println("Index " + index + " out Of range. Last Array index is " + (length - 1));
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        // Печать заполненной части массива (исключая capacity)
        return Arrays.toString(Arrays.copyOfRange(arr, 0, length));
    }

}
