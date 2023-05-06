package For;

import java.util.Scanner;

public class lab3task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sandar = new double[10];
        System.out.println("10 san engiz:");
        for (int i = 0; i < 10; i++) {
            sandar[i] = scanner.nextDouble();
        }
        boolean osu = true;
        for (int i = 1; i < 10; i++) {
            if (sandar[i] <= sandar[i-1]) {
                osu = false;
                break;
            }
        }
        if (osu) {
            System.out.println("Osu retimen.");
        } else {
            System.out.println("Osu retimen emes.");
        }
    }
}
