package com.soloviov.beginning.lessons3;

/**
 * Created by Сережка on 09.04.2015.
 */
public class ExampleArray2 {                                        // задача № 3
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {                    // наполнение массива строками
            array[i] = "str" + i;
        }
        for (int i = 0; i < array.length / 2; i++) {                // сортировка массива в обратном порядке
            String temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        String newString = array[0];
        for (int i = 1; i < array.length; i++) {                    // склеивание массива в одну строку
            newString += array[i];
        }

        String subStr = newString.substring(2, newString.length()); // удаление первых трех символов
        String subStr0 = subStr.substring(0, subStr.length() - 5);  // удаление последних пяти символов
        String subStr1 = subStr0.trim();                            // удаление пробелов в начале и конце троки
        String a = subStr1.substring(0, 1);                         // сравнение первого символа
        if (a.equals("s"))
            System.out.println(true);
        a = subStr1.substring(subStr1.length() - 1);                // сравнение последнего символа
        if (a.equals("m"))
            System.out.println(true);

        String finalString = subStr1.toUpperCase();                 // перевод строки в верхний регистр
        System.out.println(finalString);

    }
}
