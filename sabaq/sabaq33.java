package sabaq;

public class sabaq33 {
    public static void main(String[] args) {
        int N = 100;
        double x = 1, s = 0, q = 1;
        for (int k = 0; k <= N; k++) {
            s += q;
            q *= x / (k + 1);
        }

        System.out.println("exp(" + x + ")=" + s);
    }
}
