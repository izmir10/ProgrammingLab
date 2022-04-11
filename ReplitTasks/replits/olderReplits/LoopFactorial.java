package replits.olderReplits;

import java.util.Scanner;

public class LoopFactorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
                result *= i;
        }
        System.out.println("result = " + result);

        System.out.println("------------------------------");

        long result2 = 1;

        while (n>0) {
            result2 = result * n;
            n--;
        }
        System.out.println("result2 = " + result2);



    }
}
