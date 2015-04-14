package com.soloviov.beginning.lessons2;

/**
 * Created by Сережка on 02.04.2015.
 */
public class PostIncrement1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("num1 = " + (num1++));
        System.out.println("num2 = " + (num2++));

        System.out.println("num1 = " + num1++);
        System.out.println("num2 = " + num2++);
    }
}
