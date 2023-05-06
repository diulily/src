package classtar;
import java.util.Random;

class Array1D {
        public int[] createArray(int length,int randomRange) {
        int[] array=new int[length];
        Random random=new Random();
        for(int i=0;i<length;i++) {
            array[i]=random.nextInt(randomRange*2+1)-randomRange;
        }
        return array;
    }

    public void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int getMax(int[] array) {
        int max=array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }

    public int getMin(int[] array) {
        int min=array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min=array[i];
            }
        }
        return min;
    }

    public int getIndexOfMax(int[] array) {
        int maxIndex=0;
        for (int i = 1; i<array.length; i++) {
            if (array[i]>array[maxIndex]) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public int getIndexOfMin(int[] array) {
        int minIndex=0;
        for (int i=1; i<array.length; i++) {
            if (array[i]<array[minIndex]) {
                minIndex=i;
            }
        }
        return minIndex;
    }

    public void sortArray(int[] array) {
        for (int i = 0; i<array.length-1; i++) {
            for (int j = i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public void descSortArray(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}


