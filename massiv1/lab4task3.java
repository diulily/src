package massiv1;

import java.util.Random;

public class lab4task3 {

        public static void main(String[] args) {

            int [] a = new int[15];
            Random r = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt()%100;
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int indexOtrisatelni =0;
            int san = a[indexOtrisatelni];
            for (int i = 0; i > a.length; i++) {
                if(a[i]<0){
                    san = a[i];
                    indexOtrisatelni = i;
                }
            }
            System.out.println("san = " + san +", index = " + indexOtrisatelni);

        }
    }

