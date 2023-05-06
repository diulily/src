package massiv2;

import java.util.Random;
import java.util.Scanner;

public class lab5task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i, j;
        int d = 0;
        int x[] = new int[9];
        int a[][] = new int[6][9];
        for (j = 0; j < 9; j++) {
            x[j] = r.nextInt(5) + 5;
            System.out.print(x[j] + "  ");
        }
        System.out.println();
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 9; j++) {
                d += Math.pow(x[j], i);
                a[i][j] = d;
                d = 0;
            }
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 9; j++) {
                System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);
            }

        }
    }
}
