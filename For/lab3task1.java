package For;
import java.util.Scanner;
public class lab3task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("A=");
        int a = sc.nextInt();
        System.out.print("n=");
        int n = sc.nextInt();
        for (int i=1; i<n; i++){
            a=a*a;
        }
        System.out.print("A^n=" + a);
    }
}
