package For;
import java.util.Scanner;
public class lab3task2 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("N=");
            int n = sc.nextInt();
            int k=1, x=1;
            for (int i=1; i<=n; i++){
                x=k*i;
                k=x;
            }
            n=x;
            System.out.print("N!=" + n);
        }
    }

