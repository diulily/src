package massiv2;
public class lab5task6 {
    public static void main(String[] args) {
        int[][] a = {{4, 5, 1, 6},
                {2, 9, 8, 7},
                {3, 1, 6, 4}};

        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[maxRow][maxCol]) {
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        int temp = a[0][0];
        a[0][0] = a[maxRow][maxCol];
        a[maxRow][maxCol] = temp;


        if (maxRow != 0) {
            temp = a[0][0];
            a[0][0] = a[maxRow][0];
            a[maxRow][0] = temp;

            temp = a[0][1];
            a[0][1] = a[maxRow][1];
            a[maxRow][1] = temp;

            temp = a[0][2];
            a[0][2] = a[maxRow][2];
            a[maxRow][2] = temp;
        }

        if (maxCol != 0) {
            temp = a[0][0];
            a[0][0] = a[0][maxCol];
            a[0][maxCol] = temp;

            temp = a[1][0];
            a[1][0] = a[1][maxCol];
            a[1][maxCol] = temp;

            temp = a[2][0];
            a[2][0] = a[2][maxCol];
            a[2][maxCol] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
