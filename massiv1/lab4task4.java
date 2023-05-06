package massiv1;

import java.util.Random;

public class lab4task4 {
    public static void main(String[] args) {

        int[] a = new int[15];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt() % 10;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int nul=0;
        int san = a[nul];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                san=a[i];
                nul = i;
            }

    }
        System.out.println("san = " + san +",index = " + nul);
    }
}

