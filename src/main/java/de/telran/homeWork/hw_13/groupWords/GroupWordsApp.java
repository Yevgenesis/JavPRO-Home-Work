package de.telran.homeWork.hw_13.groupWords;

import java.util.HashMap;
import java.util.Map;

public class GroupWordsApp {
    /*
     Сгруппируйте слова с одинаковым набором символов
    Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
    вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};

    Выход:
    student, students,
    cat, act,
    dog, god,
    flow, wolf
    */
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};

        for (int i = 0; i < words.length - 1; i++) {
            if (isEqualsCharsInWords(words[i], words[i + 1])) {
                System.out.println(words[i] + ", " + words[i + 1]);
            }
        }
    }

    private static boolean isEqualsCharsInWords(String word1, String word2) {
        return isEqualsMaps(wordToCharMap(word1), wordToCharMap(word2));
    }

    private static Map<Character, Integer> wordToCharMap(String word) {
        Map<Character, Integer> checkMapArr = new HashMap<>();
        for (char s : word.toCharArray()) {
            checkMapArr.put(s, checkMapArr.getOrDefault(s, 0) + 1);
        }
        return checkMapArr;
    }

    private static boolean isEqualsMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (char s : map1.keySet()) {
            if (!map2.containsKey(s)) return false;
        }
        return map1.size() == map2.size();
    }
}
