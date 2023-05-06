package For;
import java.util.Scanner;
public class lab3task7 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("N=");
            double n = sc.nextDouble();
            double a, k=0.0001;
            for (double i=1; i<=n; i++){
                a=Math.cos(Math.pow(i, 3))*Math.sin(i*n);
                if(k>a){
                    System.out.println("menshe: " + a);
                }
            }
        }
    }


