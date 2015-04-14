package com.soloviov.beginning.lessons3;

import java.util.Arrays;

/**
 * Created by Сережка on 09.04.2015.
 */
public class ExampleArray5 {                                        // задача № 5
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0][0] = (int)(Math.random() * 100 + 1);
        array[0][1] = (int)(Math.random() * 100 + 1);
        array[0][2] = (int)(Math.random() * 100 + 1);
        array[0][3] = (int)(Math.random() * 100 + 1);
        array[1][0] = (int)(Math.random() * 100 + 1);
        array[1][1] = (int)(Math.random() * 100 + 1);
        array[1][2] = (int)(Math.random() * 100 + 1);
        array[1][3] = (int)(Math.random() * 100 + 1);
        array[2][0] = (int)(Math.random() * 100 + 1);
        array[2][1] = (int)(Math.random() * 100 + 1);
        array[2][2] = (int)(Math.random() * 100 + 1);
        array[2][3] = (int)(Math.random() * 100 + 1);
        array[3][0] = (int)(Math.random() * 100 + 1);
        array[3][1] = (int)(Math.random() * 100 + 1);
        array[3][2] = (int)(Math.random() * 100 + 1);
        array[3][3] = (int)(Math.random() * 100 + 1);
        System.out.println(Arrays.deepToString(array));
    }
}
