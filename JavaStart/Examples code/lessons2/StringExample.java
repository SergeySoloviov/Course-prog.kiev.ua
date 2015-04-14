package com.soloviov.beginning.lessons2;

/**
 * Created by Сережка on 02.04.2015.
 */
public class StringExample {
    public static void main(String[] args) {
        String s1 = "reba";
        String s2 = "134661";
        String s3 = s1 + s2;
        String s4 = s1.substring(2);
        int x = s2.length();
        String s5 = s1.toUpperCase();
        char c = s1.charAt(2);
        int pos = s1.indexOf("eb");
        String s6 = "aaaaccccdddd".replace("aaa", "[[[[");

        System.out.println(s6);
    }
}
