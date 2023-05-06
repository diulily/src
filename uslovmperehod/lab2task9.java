package uslovmperehod;

import java.util.Scanner;

public class lab2task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        if (A<0) {
            if (A>B){
                System.out.println(A);
            } else{
                System.out.println(B);
            }
        }
        else {
            if (A>B){
                System.out.println(B);
                }else{
                System.out.println(A);
            }
    }
}
}
