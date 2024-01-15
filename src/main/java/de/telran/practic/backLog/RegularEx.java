package de.telran.practic.backLog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {
    public static void main(String[] args) {
        String regex = ".*www.*";
        String actulaString = "www.telran.de";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actulaString);
        boolean matches = matcher.matches();
        System.out.println(matches);

        System.out.println(Pattern.matches(regex, actulaString));

    }
}
