package lessons5;

import java.util.Date;

/**
 * Created by Сережка on 14.04.2015.
 */
public class MyClass {
    public static void main(String[] args) {
        Date dt1 = new Date(2014 - 1900, 7, 25);
        System.out.println(dt1);

        long ctm = System.currentTimeMillis();
        Date dt2 = new Date();
        System.out.println(dt2);
    }
}
