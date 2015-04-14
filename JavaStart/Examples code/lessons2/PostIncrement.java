package com.soloviov.beginning.lessons2;

/**
 * Created by Сережка on 02.04.2015.
 */
public class PostIncrement {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        num1 = 100;
        num2 = ++num1;
        num3 = num2++ + ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}
