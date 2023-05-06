package massiv1;

public class lab4task10 {
    public static void main(String[] args) {
        int[] a = {-3, 5, 7, -8, 1, 2, -1, 6, 4, -9};
        int sum = 0;

        for (int i = 0; i <a.length; i++) {
            if (a[i] > 0) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
