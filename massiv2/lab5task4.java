package massiv2;
import java.util.Random;
public class lab5task4 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}};
        int[] arr = new int[6];

        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < a[i].length; j++) {
                arr[j] = a[i][j];
            }
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i+1][j];
            }
            for (int j = 0; j < a[i].length; j++) {
                a[i+1][j] = arr[j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
