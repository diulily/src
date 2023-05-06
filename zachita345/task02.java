package zachita345;

import java.util.Random;
public class task02 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();}
        System.out.println();

        int[][] b = new int[3][3];
        Random random2 = new Random();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = random2.nextInt(10);
            }
        }
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();}
        System.out.println();

        int sum[][]=new int[3][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
