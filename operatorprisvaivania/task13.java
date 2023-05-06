package operatorprisvaivania;

public class task13 {
    public static void main(String[] args) {
        int A = 3, B = 4, C = 5;

        int P = (A + B + C) / 2;
        double S;
        S = Math.sqrt(P * (P - A) * (P - B) * (P - C));
        double Ha = (2 * S) / A;
        double Hb = (2 * S) / B;
        double Hc = (2 * S) / C;

        System.out.println(Ha);
        System.out.println(Hb);
        System.out.println(Hc);
    }
}
