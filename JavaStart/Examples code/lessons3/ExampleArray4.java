package com.soloviov.beginning.lessons3;

/**
 * Created by Сережка on 09.04.2015.
 */
public class ExampleArray4 {                                        // задача № 5
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                array[i] = (int)(Math.random() * 100 + 1);
        }
        for (int a : array)
            System.out.println(a);
    }
}
