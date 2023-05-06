package uslovmperehod;

import java.util.Scanner;

public class lab2task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a<c){
            if(a>b){
                System.out.println("b");
            }
            else {
                System.out.println("c");
            }
        }
        else {
            if(a<b){
                System.out.println("b");
            }
            else {
                System.out.println("a");
            }
        }
    }
}
