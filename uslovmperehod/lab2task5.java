package uslovmperehod;

import java.util.Scanner;

public class lab2task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int a=in.nextInt();
        int b=in.nextInt();
        int f=0;
        if(a<b || a==b){
            a=f;
            System.out.println(a);
            System.out.println(b);
        }
        else  {
            System.out.println(a);
            System.out.println(b);
        }
    }
}

