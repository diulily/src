package massiv1;

public class lab4task19 {
    public static void main(String[] args){
        int[] a= {8, 5, 9, 7, 10, 2, 3, 4, 6, 3};

        int minIndex=0;
        for (int i=1; i<a.length; i++) {
            if (a[i]<a[minIndex]) {
                minIndex=i;
            }
        }

        int temp=a[minIndex];
        a[minIndex]=a[a.length-1];
        a[a.length-1]=temp;

        System.out.print("The rearranged array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
