package day09_IfStatements;

import java.util.Scanner;

public class AddNumbersScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println("Sum of numbers: " + n1+n2+n3);

    }


}
