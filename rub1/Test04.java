package rub1;

import java.util.Random;

public class Test04 {
    public static void main(String[] args){

        int [][]arr = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        int sum=0;
        int arif=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            sum+=arr[i][j];
            arif=sum/100;
            }
        }
        System.out.print("arif:"+arif);

       int a= Math.abs(arr[0][0]-arif);
       int zhaq=arr[0][0];
       int x=0, y=0;
        for (int i= 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int z= Math.abs(arr[i][j]-arif);
                if(z<a){
                    a=z;
                    zhaq=arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(zhaq);
        System.out.println(x+" "+y);
    }
}
