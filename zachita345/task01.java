package zachita345;

import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];

        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100) - 10;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
