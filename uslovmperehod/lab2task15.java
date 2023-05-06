package uslovmperehod;

import java.util.Scanner;

public class lab2task15 {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int A=in.nextInt();

        if ( A % 10  == 1   || A == 1) {
            System.out.println("god");
        }
        else if ( ( (A % 10 <= 3) && ( A% 10 > 1) )   ||  ( ( A <= 3 ) && (A> 1) )  ) {
            System.out.println("goda");
        }
        else {
            System.out.println("let");
        }
    }

}
