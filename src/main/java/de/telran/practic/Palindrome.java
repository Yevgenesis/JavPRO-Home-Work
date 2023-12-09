package de.telran.practic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
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



