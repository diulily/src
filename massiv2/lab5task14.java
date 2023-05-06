package massiv2;
import java.util.Random;
public class lab5task14 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(90) + 10;
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("max = " + max);
        double[][] ar = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < a[i].length; j++) {
                a[i][j]=a[i][j]/max;
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
