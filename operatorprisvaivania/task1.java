package operatorprisvaivania;

public class task1{
    public static void main(String[] args)
    {
        int A=3, B=4, C=5, H=6;

        int  P =(A + B + C) / 2;
        double S;
        S = Math.sqrt(P*(P-A)*(P-B)*(P-C));
        double V;
        V = (S*H)/3;
        System.out.println(V);

    }}