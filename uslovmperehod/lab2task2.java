package uslovmperehod;
import java.util.Scanner;
public class lab2task2
{public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    int C=in.nextInt();
    if(A<B &&A<C){
        System.out.println("A min");
    }
    else if(B<A && B<C){
        System.out.println("B min");
    }
    else{
        System.out.println("C min");
    }
}
}

