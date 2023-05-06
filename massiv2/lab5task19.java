package massiv2;

public class lab5task19 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
             int rowMax = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > rowMax) {
                    rowMax = a[i][j];
                }
            }
            maxSum += rowMax;
        }
        System.out.println("Сумма наибольших значений в строках матрицы равна: " + maxSum);
    }
}
