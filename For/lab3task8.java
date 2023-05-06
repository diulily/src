package For;
import java.util.Scanner;
public class lab3task8 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("N=");
            double n = sc.nextDouble();
            System.out.print("A=");
            double a = sc.nextDouble();
            System.out.print("B=");
            double b = sc.nextDouble();
            double x=0;
            for (double i=1; i<=n; i++){
                x=i*i*i-17*i*n*n+n*n*n;
                if((x%a)==0 & (x%b)!=0){
                    System.out.println(x);
                }
            }
        }
    }

