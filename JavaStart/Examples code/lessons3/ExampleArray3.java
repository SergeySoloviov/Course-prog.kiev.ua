package com.soloviov.beginning.lessons3;

import java.util.Arrays;

/**
 * Created by Сережка on 09.04.2015.
 */
public class ExampleArray3 {                                                // задача № 4
    public static void main(String[] args) {
        char[] array = new char[16];
        for (int i = 0; i < array.length ; i++) {
            array[i] = 'c';
        }
        Arrays.sort(array);
        String str = new String(array);
        String uperStr = str.toUpperCase();
        System.out.println(uperStr.hashCode());
        String replStr = uperStr.replace("C", "P");
        System.out.println(replStr);

    }
}
