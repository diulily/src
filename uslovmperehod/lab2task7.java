package uslovmperehod;

import java.util.Scanner;

public class lab2task7 {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double x=in.nextInt();
    double y=in.nextInt();

    if(x<y){
        System.out.println(x/2);
        System.out.println(y*y);
    }
    else{System.out.println(y/2);
        System.out.println(x*x);}
}
}
