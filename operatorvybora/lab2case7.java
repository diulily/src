package operatorvybora;

import java.util.Scanner;
public class lab2case7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();

    boolean X = (x>0);
    boolean Y = (y>0);

        if (X && Y){
        System.out.println(1);
    }
        else if (!X && !Y){
        System.out.println(3);
    }
        else if (!X && Y){
        System.out.println(2);
    }
        else
                System.out.println(4);
}
}

