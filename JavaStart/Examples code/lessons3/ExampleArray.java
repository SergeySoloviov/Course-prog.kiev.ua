package com.soloviov.beginning.lessons3;

/**
 * Created by Сережка on 09.04.2015.
 */
public class ExampleArray {                                         // задача № 2
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("First element in the array: " + array[0]);
        System.out.println("Last element in the array: " + array[9]);
        int srAref = (array[0] + array[9]) / 2;
        System.out.println("Arithmetic average of the first and last element: " + srAref);
        int sumElement = 0;
        for (Integer c : array) {
            sumElement += c;
        }

        System.out.println("Sum of all array elements: " + sumElement);

    }
}
