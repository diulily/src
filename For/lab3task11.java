package For;
import java.util.Scanner;


public class lab3task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (double i = 1; i <= n; i++) {
                i =Math.pow((i),m);
            sum += i;

        }
        System.out.println(sum);
    }
}


