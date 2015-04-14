package com.soloviov.beginning.lessons3;

/**
 * Created by Сережка on 09.04.2015.
 */
public class MinMaxArray {                                                  // задача № 1
    public static void main(String[] args) {
        byte[] array = new byte[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (byte)(Math.random()*100 + 1);
        }
        byte maximum = array[0];
        byte minimum = array[0];
        for (Byte a : array)
        {
            System.out.println(a);
            if (maximum < a)
                maximum = a;
            if (minimum > a)
                minimum = a;
        }
        System.out.println("\n" + maximum);
        System.out.println(minimum);
    }
}
