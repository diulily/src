package operatorprisvaivania;

public class task6 {
    public static void main(String[] args)
    {
        int A=4,B=4,C=4;

        int  P =(A + B + C) / 2;
        double S;
        S = Math.sqrt(P*(P-A)*(P-B)*(P-C));

        System.out.println(S);

    }
}


