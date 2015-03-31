package com.soloviov.beginning.lessons1;

import java.util.Map;

/**
 * Created by Сережка on 31.03.2015.
 */
public class SystemProperties {
    public static void main(String[] args) {

        // Java 8 Show all system properties
//        System.getProperties().forEach((k, v)
//        System.out.println("Key - " + k + " Value - " + v));

        // Old way to show all system properties
        for (Map.Entry<Object,Object> entry : System.getProperties().entrySet()) {
            System.out.println("Key - " + entry.getKey() + " Value - " + entry.getValue());
        }

        // Getting information about OS name from system properties
        System.out.println(System.getProperty("os.name"));

        System.out.println(System.getProperties());
    }

}
