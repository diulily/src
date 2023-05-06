package massiv1;

public class lab4task14 {
    public static void main(String[] args) {
        int[]a = {1, 5, 2, 7, 3, 9, 4, 8, 6, 0};
        int san = 0;

        for (int i = 0; i <a.length; i++) {
            if (a[i] > 3) {
                san++;
            }
        }

        System.out.println("san: " + san);
    }
}
