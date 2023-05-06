package massiv1;

public class lab4task17 {
    public static void main(String[] args) {
        int[]a={1,0,3,4,0,0,7,0,9,10};
        int n=10;
        int k=0;

        for (int i=0; i<n; i++) {
            if (a[i]!=0) {
                a[k]=a[i];
                k++;
            }
        }
        while (k<n){
            a[k]=0;
            k++;
        }

        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
