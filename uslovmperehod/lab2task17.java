package uslovmperehod;

import java.util.Scanner;

public class lab2task17 {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
    if (x>y)
    {
        x = x + y;
        y = x - y;
        x = x - y;
    }
        System.out.println(y);
        System.out.println(x);
    }
}
