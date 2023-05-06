package uslovmperehod;

import java.util.Scanner;

public class lab2task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if ((x + y > z) && (x + z > y) && (y + z > x)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}