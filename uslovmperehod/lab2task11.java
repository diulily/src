package uslovmperehod;

import java.util.Scanner;
import java.lang.Math;
public class lab2task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a<=b && b<=c && c<=d) {
            System.out.println(a = Math.max(Math.max(Math.max(a, b), c),d));
            System.out.println(b = Math.max(Math.max(Math.max(a, b), c),d));
            System.out.println(c = Math.max(Math.max(Math.max(a, b), c),d));
            System.out.println(d = Math.max(Math.max(Math.max(a, b), c),d));
        } else if (a<b && b<c && c< d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else {
            System.out.println(a * a);
            System.out.println(b * b);
            System.out.println(c * c);
            System.out.println(d * d);
        }
    }
}
