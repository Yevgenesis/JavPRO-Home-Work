package de.telran.homeWork.hw_16.countDuplicates;

import java.util.List;

public class Main {
    /*
Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
Сколько раз объект «Big» встречается в коллекции?*/
    public static void main(String[] args) {
        List<String> arr = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        String str = "Big";
        Long countEl = arr.stream()
                .filter(el -> el.equals(str))
                .count();
        System.out.println(countEl);
    }
}
