package massiv2;

import java.util.Random;
import java.util.Scanner;

public class lab5task7 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int variant=sc.nextInt();
        int a[][]=new int[5][5];
        int i,j,sum=0,k=0;

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j]=r.nextInt(90)+10;
                System.out.print(a[i][j]+"  ");}
            System.out.println();}
        System.out.println();
        if(variant==1){for(i=0;i<5;i++){
            if(i==0||i==4){
                for(j=0;j<5;j++){
                    sum+=a[i][j];}}
            else{
                for(j=0;j<5;j+=4){
                    sum+=a[i][j];}}}
            System.out.println("Summa:"+sum);}
        else if(variant==2){
            for(i=0;i<5;i++){
                for (j = 0; j < 5; j++) {
                    if (i == j) {
                        sum += a[i][j];

                    }
                }}
            j=4;
            for(i=0;i<5&&j>-1;i+=1) {
                sum+=a[i][j];
                j--;}
            System.out.print("Summa:"+(sum-a[2][2]));}
        else if(variant==3){
            j=4;
            for(i=0;i<3;i++){
                for(k=j;k>-1;k--) {
                    if (j == 2) {
                        sum += a[i][k + 1];
                    } else if (j == 0) {
                        sum += a[i][k + 2];
                    } else {
                        sum += a[i][k];
                    }
                    System.out.println(sum);
                }j-=2;
            }
            for(i=3;i<4;i++){
                for(j=1;j<4;j++){
                    sum+=a[i][j];
                }
            }
            for(i=4;i<5;i++){
                for(j=0;j<5;j++){
                    sum+=a[i][j];

                }                }
            System.out.println("Summa:"+sum);}

    }}
