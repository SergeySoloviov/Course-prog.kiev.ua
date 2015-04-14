package lessons5;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

/**
 * Created by Сережка on 14.04.2015.
 */
public class DateExample2 {
    public static void main(String[] args) {
        LocalDate localeData = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localeData);
        System.out.println(localTime);
    }
}
