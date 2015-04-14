package com.soloviov.beginning.lessons4;

import java.util.Scanner;

/**
 * Created by Сережка on 09.04.2015.
 */
public class HomeWork {                                             // задача № 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        assert a < 5 : a;
    }
}
