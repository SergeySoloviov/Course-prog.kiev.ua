package com.soloviov.beginning.lessons2;

import java.util.Scanner;

/**
 * Created by Сережка on 02.04.2015.
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("1 - Cумма");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Деление");
        System.out.println("Выберите операцию над числами: 1, 2, 3");
        int c = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();


        if (c == 1)
            System.out.println("Сумма введенных чисел равна: " + (a + b));
            if (c == 2)
                System.out.println("Разность введенных чисел равна: " + (a - b));
            if (c == 3)
                System.out.println("Деление введенных чисел равно: " + (a / b));
         else
            System.out.println("Введена не верная операция");
    }
}

