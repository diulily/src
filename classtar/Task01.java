package classtar;
import java.util.Random;
public class Task01 {
        public static void main(String[] args) {
            Array1D array1D = new Array1D();
            int[] array=array1D.createArray(10, 50);
            array1D.printArray(array);
            System.out.println("Max:"+array1D.getMax(array));
            System.out.println("Min:"+array1D.getMin(array));
            System.out.println("Index of Max:"+array1D.getIndexOfMax(array));
            System.out.println("Index of Min:"+array1D.getIndexOfMin(array));
            array1D.sortArray(array);
            array1D.printArray(array);
            array1D.descSortArray(array);
            array1D.printArray(array);
        }
    }

    class array1D {
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


