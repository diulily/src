package uslovmperehod;

import java.util.Scanner;

public class lab2task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int K=0;

        if (x > 0 && y > 0) {
            K = 1;
        }
        if (x < 0 && y > 0) {
            K = 2;
        }
        if (x < 0 && y < 0) {
            K = 3;
        }
        if (x > 0 && y < 0) {
            K = 4;
        }
        System.out.println(K);
    }
}
