package massiv1;

public class lab4task13 {
    public static void main(String[] args) {
        int[]a = {-2, 5, 0, 1, 7, -3, 4, -6, 9, -8};
        int san = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                san*= a[i];
            }
        }

        System.out.println("Elementy: " + san);
    }
}
