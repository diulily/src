package For;
import java.util.Scanner;
public class lab3task4 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a=0, n=0, min=0;
            for (int i=1; i<=10; i++){
                System.out.print("10 чисел:");
                n = sc.nextInt();
                if(i==1){
                    min=n;
                }
                if(min<n){

                }else {
                    min=n;
                }
            }
            System.out.print("Min=" + min);
        }
    }

