package com.soloviov.beginning.lessons2;

/**
 * Created by Сережка on 02.04.2015.
 */
public class TypeCasting {
    public static void main(String[] args) {
        byte a = (byte)(127+1);
        short x = Byte.MAX_VALUE + 1;
        byte y = (byte)x;
        byte z = (byte)(x - 129);
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
