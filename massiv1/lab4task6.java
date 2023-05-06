package massiv1;

public class lab4task6 {
    public static void main(String[] args) {
        int[] a = {3, 5, 0, 1, -7, 9, 8, -2, 2, 6};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                break;
            }
            sum += a[i];
        }

        System.out.println("Sum: " + sum);
    }
}
