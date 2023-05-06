package massiv2;

import java.util.Scanner;

public class lab5task10 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=a[i]-3*a[j];
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
