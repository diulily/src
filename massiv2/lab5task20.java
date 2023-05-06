package massiv2;

public class lab5task20 {
    public static void main(String[] args) {
        int[][]a = {
                {2, 4, 6, 8, 10, 12},
                {14, 16, 18, 20, 22, 24},
                {26, 28, 30, 32, 34, 36},
                {38, 40, 42, 44, 46, 48},
                {50, 52, 54, 56, 58, 60},
                {62, 64, 66, 68, 70, 72}
        };
        int largestValue = Integer.MIN_VALUE;
        int[] indexes = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largestValue) {
                    largestValue = a[i][j];
                    indexes[0] = i;
                    indexes[1] = j;
                } else if (a[i][j] == largestValue) {
                    System.out.println("[" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("[" + indexes[0] + "][" + indexes[1] + "]");
    }
}
