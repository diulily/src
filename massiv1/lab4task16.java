package massiv1;

public class lab4task16 {
    public static void main(String[] args) {

            int[] X = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] Y = new int[10];
            int k = 4;

            for (int i=0; i<X.length-k; i++) {
                Y[i]=X[i+k];}
            for (int i=0; i<k; i++) {
                Y[X.length-k+i]=X[i];}
            System.out.print("Massiv: ");

            for (int i=0; i<Y.length; i++) {
                System.out.print(Y[i] + " ");
            }
            System.out.println();
        }
    }
