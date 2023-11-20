package de.telran.practic.longestSubstring;

public class Main {
    public static void main(String[] args) {
        String s = " ";
        String str = "";
        int maxSub = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(s.substring(i, i + 1))) {
                str += s.charAt(i);
                if (maxSub < str.length()) {
                    maxSub = str.length();
                }
            }else {
                str = str.substring(str.indexOf(s.substring(i, i + 1))+1) + s.substring(i, i + 1);

            }
        }
        System.out.println(maxSub);
    }
}
