package ForArrays;

import java.util.Scanner;

public class Lab9 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ForArrays fora=new ForArrays();
        int a[]=fora.setArray(n);
        fora.printArray(a);
        int b=fora.lengthArray(a);
        int max=fora.maxElement(a);
        int min=fora.minElement(a);
        int c[]=fora.sortArray(a);
        System.out.println();
        System.out.println("length:"+b);
        System.out.println("max:"+max);
        System.out.println("min"+min);
        System.out.print("new massive:");
        for(int i=0;i<n;i++){

            System.out.print(c[i]+" ");}
    }


}
