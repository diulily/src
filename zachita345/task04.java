package zachita345;

import java.util.Random;

public class task04 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
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
            System.out.println();
        }

        int ar[][]=new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                ar[i][j] = a[i][a.length-1-j];
        }
            System.out.println();


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }


    }
}
