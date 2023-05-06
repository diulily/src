package massiv2;

public class lab5task11 {
    public static void main(String []args){
        float a[][]=new float[7][7];
        int i,j;
        for (j = 0; j <7; j++) {
            a[1][j] = 2 * (float)j + 3;
        }

        for(j=0;j<7;j++){
            a[2][j]=(float)j-3/(2+1/(float)j);
        }
        for(i=2;i<7;i++){
            for(j=0;j<7;j++){
                a[i][j]=a[i-1][j]+a[i-2][j];
            }
        }
        for(i=0;i<7;i++){
            for(j=0;j<7;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();}
    }
}
