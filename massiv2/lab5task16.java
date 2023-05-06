package massiv2;

import java.util.Arrays;

public class lab5task16 {
    public static void main(String[] args) {
        int n = 3;
        double[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[] diagonal = new double[n];
        for (int i = 0; i < n; i++) {
            diagonal[i] = a[i][i];
        }
        System.out.println(Arrays.toString(diagonal));
    }
}
