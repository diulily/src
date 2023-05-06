package massiv2;
import java.util.Scanner;
public class lab5task8 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int variant=sc.nextInt();
        int a[][]=new int[10][10];
        int n=1;
        int i,j;
        if(variant==1){for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(i==j){
                    a[i][j]=i;
                }
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();

        }}
        else if(variant==2){
            for(i=0;i<10;i++){
                for(j=0;j<10;j++){
                    a[i][j]+=n;
                    n++;
                    System.out.print(a[i][j]+"  ");
                    if(a[i][j]<10){
                        System.out.print(" ");
                    }
                }
                System.out.println();}
        }
        else if(variant==3){
            for(i=0;i<10;i++){
                for(j=0;j<10;j++){
                    if(i==j){
                        a[i][j]=1;

                    }
                    else if(i>j){
                        a[i][j]=0;
                    }
                    else if(i<j){
                        a[i][j]=a[i][j-1]+1;
                    }
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}
