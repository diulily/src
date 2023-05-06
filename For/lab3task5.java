package For;
import java.util.Scanner;
public class lab3task5 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("N:");
            int n = sc.nextInt();
            for (int i=n; i>0; i--) {
                if ((n%i)==0) {
                    System.out.print(i + " ");
                }
            }
        }
    }


