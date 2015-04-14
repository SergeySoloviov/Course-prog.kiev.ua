package lessons5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Сережка on 14.04.2015.
 */
public class Class {
    public static void main(String[] args) {
        Date dt = new Date(System.currentTimeMillis());


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String res = simpleDateFormat.format(dt);
        System.out.println(res);
    }
}
