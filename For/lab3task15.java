package For;

import java.util.Scanner;
public class lab3task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();

        int y = 1, sum = 1;
        for(int i = 2; i <= n; ++i){
            y *= i;
            sum += y;
        }


        System.out.println(sum);
    }
}

