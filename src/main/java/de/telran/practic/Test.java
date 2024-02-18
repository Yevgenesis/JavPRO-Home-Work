package de.telran.practic;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 3, 5, 7));
        boolean isAdd = isAddElement(arrayList, 9);
        System.out.println(isAdd);
    }

    public static boolean isAddElement(List<Integer> arr, int element) {
        if (arr.size() < 10) {
            arr.add(element);
            return true;
        } else {
            return false;
        }
    }
}

class Test2 {

}

class Test3 {

}




