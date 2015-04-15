package TestExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Сережка on 15.04.2015.
 */
public class StringTest {                                           // тест скорости работы String, StringBuffer, StringBuilder
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("d:\\флешка\\Инна\\рецепт.docx"));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        String[] words = sb.toString().split("\\s+");
        System.out.println("Total words:" + words.length);
        waitEnter();

        long ts = System.nanoTime();

//        String buff = "";
//        StringBuffer buff = new StringBuffer();
        StringBuilder buff = new StringBuilder();

        for (String word : words) {
//            buff += word + "";
            buff.append(word).append(" ");
        }

        long te = System.nanoTime();

        System.out.println("Complete, lenght:" + buff.length() + " elapsed time:" + (te - ts)/1e6 + "ms");
    }

    private static void waitEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter key.");
        scanner.nextLine();
    }
}
