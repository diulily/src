package massiv1;

import java.util.Arrays;

public class lab4task20 {
    public static void main(String[] args) {
        double[] a=new double[9];
        for (int i=0; i<a.length; i++) {
            a[i]=Math.sqrt(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
