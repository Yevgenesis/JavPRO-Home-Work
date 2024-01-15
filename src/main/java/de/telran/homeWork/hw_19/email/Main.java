package de.telran.homeWork.hw_19.email;

import java.util.regex.Pattern;

public class Main {
    /*Написать регулярное выражение для проверки email (например my_25@domen-38.de)*/
    public static void main(String[] args) {
        String email = "my_25@domen-38.de";

        String regEx = "[A-Za-z0-9_.-]*@[A-Za-z0-9_-]*.[a-z]{2,4}";

        System.out.println(Pattern.matches(regEx, email));
    }
}
