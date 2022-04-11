package day19_LoopPractices;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2*n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
