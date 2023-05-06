package massiv2;

public class lab5task15 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}};
        replaceElements(a);
        printMatrix(a);
    }

    public static void replaceElements(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {
                a[i][j] = 0;
            }
        }
    }
    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
