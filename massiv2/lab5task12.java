package massiv2;

import java.util.Random;
import java.util.Scanner;

public class lab5task12 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=sc.nextInt();
        int sum=0;
        int a[][]=new int[n][9];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<9;j++){
                a[i][j]=r.nextInt(10);
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        for(j=0;j<9;j++){
            for(i=0;i<n;i++){
                sum+=a[i][j];
            }
            System.out.println("Sum("+j+"):"+(double)sum/n);
            sum=0;
        }
    }
}
