package de.telran.homeWork.hw_16.deleteDuplicates;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");*/
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> res = arr.stream()
                .distinct()
//                .sorted((el1, el2) -> el2.compareTo(el1))
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(arr);
        System.out.println(res);
    }
}
