package uslovmperehod;

import java.util.Scanner;

public class lab2task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c && b > c) {
            System.out.println("a>b>c");
        }
        else {
            System.out.println( );
        }
    }
}

