package massiv1;

public class lab4task8 {
    public static void main(String[] args) {
        int[] a = {2, 5, 0, 7, -3, 1, 8, -2, 4, 6};
        int san = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                break;
            }
            san *= a[i];
        }

        System.out.println(san);
    }
}
