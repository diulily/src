package massiv2;

import java.util.Scanner;

public class lab5task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Razmer: ");
        int n = input.nextInt();


        double[][] matrix = new double[n][9];
        System.out.println("Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int j = 0; j < 9; j++) {
            int count = 0;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                    sum += matrix[i][j];
                }
            }
            if (count > 0) {
                double mean = sum / count;
                System.out.println( (j + 1) + mean);
            } else {
                System.out.println( (j + 1) );
            }
        }
    }
}
