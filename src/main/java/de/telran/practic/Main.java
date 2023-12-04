package de.telran.practic;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "MADDAM";

        List<Character> charList = new ArrayList<>();

        for (char symbol : str.toCharArray()) {
            charList.add(symbol);
        }

        Iterator<Character> iteratorForward = charList.iterator();
        ListIterator<Character> iteratorBack = charList.listIterator(charList.size());

        int cnt = charList.size()/2;

        while (iteratorForward.next() == iteratorBack.previous() && cnt !=0) {
            cnt--;
        }

        if(cnt == 0){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }


}



