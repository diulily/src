package zachita345;

import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int arr[][]=new int[5][5];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length; j++){
                arr[i][j] = a[j][i];
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
