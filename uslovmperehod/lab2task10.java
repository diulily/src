package uslovmperehod;

import java.util.Scanner;

public class lab2task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int R = in.nextInt();

        if (x < R) {
            System.out.println(" x shenberge kiredi");
        } else {
            System.out.println("x shenberge kirmeidi");}
            if (y < R) {
                System.out.println(" y shenberge kiredi");
            } else {
                System.out.println("y shenberge kirmeidi");
            }
        }
    }

