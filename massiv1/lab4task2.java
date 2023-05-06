package massiv1;

import java.util.Random;

public class lab4task2 {

        public static void main(String[] args) {

            int [] a = new int[15];
            Random r = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt()%100;
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int indexOfMin=0;
            int min = a[indexOfMin];
            for (int i = 0; i < a.length; i++) {
                if(a[i]<min){
                    min = a[i];
                    indexOfMin = i;
                }
            }
            System.out.println("min = " + min +", index = " + indexOfMin);

        }
    }

