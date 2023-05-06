package massiv2;

import java.util.Random;

public class lab5task5 {
    public static void main(String[] args) {
        int [][]a = new int[6][6];

        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(90) + 10;
            }
        }

        int iIndexOfMax = 0;
        int jIndexOfMax = 0;
        int max = a[iIndexOfMax][jIndexOfMax];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                    iIndexOfMax = i;
                    jIndexOfMax = j;
                }
            }
        }
        System.out.println("max = " + max + " indexes = ["+iIndexOfMax+"]["+jIndexOfMax+"]");

        int iIndexOfMin = 0;
        int jIndexOfMin = 0;
        int min = a[iIndexOfMin][jIndexOfMin];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]<min){
                    min = a[i][j];
                    iIndexOfMin = i;
                    jIndexOfMin = j;
                }
            }
        }
        System.out.println("min = " + min + " indexes = ["+iIndexOfMin+"]["+jIndexOfMin+"]");


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
