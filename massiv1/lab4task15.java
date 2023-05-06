package massiv1;

public class lab4task15 {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < a.length; i += 2) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}
