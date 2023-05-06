package operatorprisvaivania;

public class task2 {
     public static void main(String[] args)
        {
            int R=20, r=10, h=30;
            double l=Math.sqrt((h * h) + Math.pow(2,(R - r)));
            double S=Math.PI*l*((R+r)+Math.PI*(R*R+r*r));
            double V=(Math.PI*h)/3*Math.PI*(R*R+r*r);

            System.out.println(S);
            System.out.println(V);

        }
}
