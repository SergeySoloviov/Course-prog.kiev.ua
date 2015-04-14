package com.soloviov.beginning.lessons2;

/**
 * Created by Сережка on 02.04.2015.
 */
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "abcd";
        String s3 = "abcd";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
