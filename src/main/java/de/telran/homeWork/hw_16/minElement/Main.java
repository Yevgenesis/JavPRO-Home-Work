package de.telran.homeWork.hw_16.minElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    // Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a1", "b5", "a2", "b4");
        String res = arr.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);
        System.out.println(res);
    }
}
