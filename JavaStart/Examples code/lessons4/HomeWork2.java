package com.soloviov.beginning.lessons4;

import java.util.Scanner;

/**
 * Created by Сережка on 09.04.2015.
 */
public class HomeWork2 {                                        // задача № 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();

        assert a % 2 == 0 : "Не делится";
    }
}
