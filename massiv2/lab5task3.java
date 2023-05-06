package massiv2;

import java.util.Random;

public class lab5task3 {
    public static void main(String[] args) {
        //zhariyalau
        int[][] a = new int[6][6];
        int[] x = {1, 2, 3, 4, 5, 6};


        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
            }
        }

        System.out.println("A[6][6]:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("X[6]:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = x[j];
            }
        }


        System.out.println("A[6][6]:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
