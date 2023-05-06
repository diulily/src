package For;
import java.util.Scanner;

public class lab3task19 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("San zhaz: ");
            int n = scanner.nextInt();
            boolean g = true;
            if (n <= 1) {
                g = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    g = false;
                    break;
                }
            }
            if (g) {
                System.out.println(n + " zhup");
            } else {
                System.out.println(n + " taq");
            }
        }

    }
