package For;
import java.util.Scanner;
public class lab3task6 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n;
            int S=0, k=0;
            System.out.print("N=");
            for (int i=1; i<=10; i++){
                n = sc.nextInt();
                if((i%2)==0){
                    S=S+n;
                }
                if((i%2)==1){
                    k++;
                }
            }
            System.out.print("Sum=" + S);
            System.out.print("Kolichestvo=" + k);
        }
    }

