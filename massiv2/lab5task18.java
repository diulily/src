package massiv2;
public class lab5task18 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, 31, 32, 33, 34, 35, 36},
                {37, 38, 39, 40, 41, 42, 43, 44, 45},
                {46, 47, 48, 49, 50, 51, 52, 53, 54}
        };

        int largestElement = a[0][0];
        int smallestElement = a[0][0];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] > largestElement) {
                    largestElement = a[i][j];
                }
                if (a[i][j] < smallestElement) {
                    smallestElement = a[i][j];
                }
            }
        }
        double arithmeticMean = (double) (largestElement + smallestElement) / 2;
        System.out.println("Среднее арифметическое наибольшего и наименьшего элементов равно: " + arithmeticMean);
    }
}
