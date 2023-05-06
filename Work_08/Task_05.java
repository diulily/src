package Work_08;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        String str = "This is a sample text containing some words som you doo.";
        String[] words = str.split("\\s+|\\.");

        int min_length = words[0].length();
        String min = words[0];
        for (String word : words) {
            if (word.length() > min_length) {
                min = word;
                min_length = word.length();
            }
        }
        System.out.println(min +" "+ min_length);
    }
}
