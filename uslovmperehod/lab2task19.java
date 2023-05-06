package uslovmperehod;

import java.util.Scanner;

public class lab2task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c=0;
        int s;
        int y = in.nextInt();

        s = y % 100;
        if (s == 0) {
            c = y;
        } else {
            c = s + 1;
        }
        System.out.println(c);
    }
}


