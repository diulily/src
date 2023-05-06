package classtar;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Array2D array2D=new Array2D();
        int[][] array=array2D.createArray(5, 5, 50);
        array2D.printArray(array);
        System.out.println("Max:"+array2D.getMax(array));
        System.out.println("Min:"+array2D.getMin(array));
        System.out.println("Index of Max:"+array2D.getRowIndexOfMax(array));
        System.out.println("Index of Max:"+array2D.getColumnIndexOfMax(array));
        System.out.println("Index of Min:"+array2D.getRowIndexOfMin(array));
        System.out.println("Index of Min:"+array2D.getColumnIndexOfMin(array));
    }
}

class Array2D {
    public int[][] createArray(int rows, int columns, int randomRange) {
        int[][] array=new int[rows][columns];
        Random rand=new Random();
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                array[i][j] = rand.nextInt(randomRange * 2 + 1)-randomRange;
            }
        }
        return array;
    }

    public void printArray(int[][] array) {
        for (int[] row:array) {
            for (int element:row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public int getMax(int[][] array) {
        int max=Integer.MIN_VALUE;
        for (int[] row:array) {
            for (int element:row) {
                if (element>max) {
                    max=element;
                }
            }
        }
        return max;
    }

    public int getMin(int[][] array) {
        int min=Integer.MAX_VALUE;
        for (int[] row:array) {
            for (int element:row) {
                if (element<min) {
                    min=element;
                }
            }
        }
        return min;
    }

    public int getRowIndexOfMax(int[][] array) {
        int max=Integer.MIN_VALUE;
        int rowIndexOfMax=0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                if (array[i][j]>max) {
                    max=array[i][j];
                    rowIndexOfMax=i;
                }
            }
        }
        return rowIndexOfMax;
    }

    public int getColumnIndexOfMax(int[][] array) {
        int max=Integer.MIN_VALUE;
        int columnIndexOfMax = 0;
        for (int j=0; j < array[0].length; j++) {
            for (int i=0; i < array.length; i++) {
                if (array[i][j]>max) {
                    max=array[i][j];
                    columnIndexOfMax=j;
                }
            }
        }
        return columnIndexOfMax;
    }

    public int getRowIndexOfMin(int[][] array) {
        int min=Integer.MAX_VALUE;
        int rowIndexOfMin=0;
        for (int i=0; i < array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                if (array[i][j]<min) {
                    min=array[i][j];
                    rowIndexOfMin=i;
                }
            }
        }
        return rowIndexOfMin;
    }

    public int getColumnIndexOfMin(int[][] array) {
        int min=Integer.MAX_VALUE;
        int columnIndexOfMin=0;
        for (int j=0; j < array[0].length; j++) {
            for (int i=0; i < array.length; i++) {
                if (array[i][j]<min) {
                    min=array[i][j];
                    columnIndexOfMin=j;
                }
            }
        }
          return columnIndexOfMin;
    }
}
