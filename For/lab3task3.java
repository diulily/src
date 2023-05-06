package For;
import java.util.Scanner;
public class lab3task3 {

      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("N=");
            int n = sc.nextInt();
            int S=0, a=0, b=0, x=0;
            for (int i=1; i<=n; i++){
                a=0;b=0;
                if((i%2)==0){
                    a=i*i;
                }
                if((i%2)==1){
                    b=i*i*i;
                }
                S=S+a+b;
            }
            System.out.print("Sum=" + S);
        }
    }

