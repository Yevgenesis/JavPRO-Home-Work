package de.telran.homeWork.hw_13.checkEqualArray;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayApp {
    /*
    Проверьте, равны ли два массива или нет с точки зрения набора хранимых значений.
Не обязательно индексы равных элементов должны совпадать.
 */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 3, 5, 4, 6};
        int[] arr2 = {2, 1, 4, 3, 5, 6, 4};


        System.out.println("Массивы равны: " + checkEqualsMaps(countElementArrayToMap(arr1), countElementArrayToMap(arr2)));
    }

    public static Map<Integer, Integer> countElementArrayToMap(int[] arr) {
        Map<Integer, Integer> checkMapArr = new HashMap<>();
        for (int i : arr) {
            checkMapArr.put(i, checkMapArr.getOrDefault(i, 0) + 1);
        }
        System.out.println(checkMapArr);
        return checkMapArr;
    }

    public static boolean checkEqualsMaps(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (!map2.entrySet().contains(entry)) return false;
        }
        return map1.size() == map2.size();
    }
}
