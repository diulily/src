package For;

public class lab3task23 {
    public static void main(String[] args) {
        int stroki = 26;
        for (int i = 1; i <= stroki; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
