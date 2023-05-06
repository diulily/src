package massiv1;

public class lab4task12 {
    public static void main(String[] args) {
        int[]a = {3, -5, 7, -8, 0, 2, -1, 6, 4, -9};
        int san = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                san++;
            }
        }

        System.out.println("san: " + san);
    }
}
