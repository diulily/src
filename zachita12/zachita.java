package zachita12;

import java.util.Scanner;

public class zachita {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        if (a/100000+a/10000*0.1+a/1000*0.1==a/100*0.1+a/10*0.1+a*0.1)
        {System.out.println("Yes");


    }
        else {
            System.out.println("NO");
        }
}
}
