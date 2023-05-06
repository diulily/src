package ForArrays;
import java.util.Random;
import java.util.Arrays;
public class ForArrays implements Arrayss{

    @Override
    public int[] setArray(int n){
        Random r=new Random();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=r.nextInt()%100;

        }
        return a;}
    @Override
    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    @Override
    public int lengthArray(int a[]){

        return a.length;}

    @Override
    public int maxElement(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];

            }

        }
        return max;}
    @Override
    public int minElement(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];

            }

        }
        return min;}
    @Override
    public int[] sortArray(int a[]){
        Arrays.sort(a);

        return a;}



}
