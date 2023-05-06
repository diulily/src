package uslovmperehod;
import java.util.Scanner;
public class lab2task16 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        double y=0;
        double x ;
        System.out.println("Input x");
        x = sc.nextDouble();
        if(x>0 && x<2)
        {
            y =Math.pow(Math.cos(x),2)*x;
            y=Math.sin(Math.pow(x,2));}

        System.out.println("Function result is "+y);

    }
}
