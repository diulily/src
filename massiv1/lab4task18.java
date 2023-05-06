package massiv1;

import java.util.Random;

public class lab4task18 {
        public static void main(String[] args) {

            int [] a = new int[10];
            Random r = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt()%100;
                System.out.print(a[i] + " ");
            }
            System.out.println();

            for (int i=0; i<a.length/2; i++) {
                int k= a[i];
                a[i]=a[a.length-i-1];
                a[a.length-i-1]=k;
            }

            for (int i=0; i<a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
        }


