package sabaq;

import java.util.Random;

public class TestClass_01 {
    public static void main(String[] args) {
        MyArray myClass = new MyArray();
        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        myClass.print(arr);
        int max = myClass.getMax(arr);
        System.out.println("MAX = " + max);
    }
}

class MyArray {

    public void print (int arr[]){
        for (int element : arr) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public int getMax (int a[]) {
        int max = a[0] ;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0);
        }
        return max;
    }
}