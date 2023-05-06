package For;
import java.util.Scanner;
public class lab3task10 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("M=");
            int m = sc.nextInt();
            System.out.print("N=");
            int n = sc.nextInt();
            int S=0, SA=0, SB=0;
            for (int i=m; i<=n; i++){
                S=S+i;
                if((i%2)==0){
                    SA=SA+i;
                }
                if((i%2)==1){
                    SB=SB+i;
                }
            }
            System.out.println("S=" + S);
            System.out.println("SA=" + SA);
            System.out.println("SB=" + SB);
        }
    }

