package sabaq;

import java.util.Scanner;

public class sabaq32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, i = 1;
        do {
            sum += i;
            i += 2;}
            while (i <= 100);
            System.out.println(sum);

    }

}
