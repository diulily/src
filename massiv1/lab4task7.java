package massiv1;

import java.util.Random;

public class lab4task7 {
    public static void main(String[] args){

        int [] a = new int[10];
        Random r = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt()%100;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
