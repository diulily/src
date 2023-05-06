package massiv1;

import java.util.Random;
public class lab4task1 {

    public static void main(String[] args) {

            int [] a = new int[15];
            Random r = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt()%100;
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int indexOfMax=0;
            int max = a[indexOfMax];
            for (int i = 0; i < a.length; i++) {
                if(a[i]>max){
                    max = a[i];
                    indexOfMax = i;
                }
            }
            System.out.println("max = " + max +", index = " + indexOfMax);

        }
    }
