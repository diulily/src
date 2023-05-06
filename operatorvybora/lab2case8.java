package operatorvybora;

import java.util.Scanner;

public class lab2case8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        x %= 10;
        x *= x;
        x %= 10;
        System.out.println(x);
    }

}
