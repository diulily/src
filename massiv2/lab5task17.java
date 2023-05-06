package massiv2;

public class lab5task17 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };


        int maxElement = a[0][0];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[i][j] > maxElement) {
                    maxElement = a[i][j];
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[i][j] == maxElement) {
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
