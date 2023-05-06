package uslovmperehod;

import java.util.Scanner;

public class lab2task12 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);

        int x=in.nextInt();
        int y=in.nextInt();
        if(x<0 && y<0){
            System.out.println(Math.abs(x));
            System.out.println(Math.abs(y));
        }
        else if(x<0||y<0){
            System.out.println(x+0.5);
            System.out.println(y+0.5);
        } else if ((x > 0 && y > 0) && (x<= 0.5 && x >= 2.0) && (y <= 0.5 && y >= 2.0)) {
           System.out.println( x /= 10);
           System.out.println( y /= 10);
        }
        else {
            System.out.println(x);
            System.out.println(y);
        }
    }
}
