package de.telran.homeWork.hw_13.findDuplicate;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateApp {
    /*
    Найти первый элемент, встречающийся k раз в массиве
    */
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "a", "d", "g", "b", "a"};

        int k = 3;
        String element = findDuplicateByCount(arr, k);
        System.out.println("Элемент, встречающийся " + k + " раза: " + element);
    }

    private static String findDuplicateByCount(String[] arr, int k) {
        Map<String, Integer> mapDuplicates = new HashMap<>();
        for (String symbol : arr) {
            int count = 1;
            if (mapDuplicates.containsKey(symbol)) {
                count = mapDuplicates.get(symbol);
                count++;
            }
            mapDuplicates.put(symbol, count);
        }
        for (Map.Entry<String, Integer> entry : mapDuplicates.entrySet()) {
            if (entry.getValue() == k) return entry.getKey();
        }
        return "отсутствует";
    }
}
