package de.telran.homeWork.hw_22;

import java.util.Arrays;

public class Main {
    /*Потренируем тесты на алгоритмических задачах.
Необходимо реализовать и протестировать следующие методы:
*/
    public static void main(String[] args) {
/* 1) Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
example input:
Array1: [1, 2, 5, 5, 8, 9, 7, 10]
Array2: [1, 0, 6, 15, 6, 4, 7, 0]
example expected:
[1,7]*/
        int[] Array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] Array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        int[] commonElements = ArrayHandler.GetCommonArrayElements(Array1, Array2);
        System.out.println(Arrays.toString(commonElements));


/*2) Напишите программу на Java для удаления повторяющихся элементов из массива.
example input:
[0,3,-2,4,3,2]
example expected:
[0,3,-2,4,2]*/
        int[] array = {0, 3, -2, 4, 3, 2};
        int[] newArr = ArrayHandler.removeDuplicates(array);
        System.out.println(Arrays.toString(newArr));


/*3) Напишите программу на Java для поиска второго по величине элемента в массиве.
example input:
[-1, 4, 0, 2, 7, -3]
example expected:
4 */
        int[] arr = {-1, 4, 0, 2, 7, -3};
        int secondMaxEl = ArrayHandler.getSecondMaxNum(arr);
        System.out.println(secondMaxEl);


/*
4) Напишите программу Java для поиска второго наименьшего элемента в массиве.
example input:
[-1, 4, 0, 2, 7, -3]
example expected
-1 */
        int[] myArray = {-1, 4, 0, 2, 7, -3};
        int secondMinNum = ArrayHandler.getSecondMinNum(myArray);
        System.out.println(secondMinNum);


    }
}
