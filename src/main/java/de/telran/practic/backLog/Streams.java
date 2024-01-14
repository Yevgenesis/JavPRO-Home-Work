package de.telran.practic.backLog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

//  Задача 1: Собрать элементы потока в список.
        List<String> task1 = Stream.of("A", "B", "C").toList();

//  Задача 2: Удалить дубликаты из списка и собрать их в множество.
        List<String> task2Input = Arrays.asList("A", "B", "A", "C");
        Set<String> noDuplicates = task2Input.stream().collect(Collectors.toSet());

// Задача 3: Группировка строк по длине.
        Map<Integer, List<String>> task3 = Stream.of("apple", "banana", "cherry", "date").collect(Collectors.groupingBy(String::length));
        System.out.println(task3);


// Задача 4: Подсчет повторяющихся элементов и создание мапа.
        List<String> task4Input = Arrays.asList("A", "B", "A", "C", "B", "A");
        Map<String, Long> countMap = task4Input.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(countMap);
    }
}
