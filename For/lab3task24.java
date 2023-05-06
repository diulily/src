package For;

public class lab3task24 {
    public static void main(String[] args) {
        for (char d = 'Z'; d >= 'A'; d--) {
            for (char c = 'Z'; c >= d; c--) {
                System.out.print(d + " ");

            }
            System.out.println();
        }
    }
}