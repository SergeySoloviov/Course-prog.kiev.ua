package com.soloviov.beginning.lessons1;

/**
 * Created by Сережка on 31.03.2015.
 */
public class RuntimeExample {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println("Processors " + r.availableProcessors());
        System.out.println("Total memory " + r.totalMemory());
        System.out.println("Free memory " + r.freeMemory());
        System.out.println("Max memory " + r.maxMemory());
    }
}
