package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        if ( ! (operator == '+' || operator == '-')) { // if the operator is not valid (+ or -)
            System.err.println("Invalid math operator: " + operator);
            System.exit(0); // terminates the program
        }

        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();

        int result = 0;
        if (operator=='+'){
            result = num1 + num2;
        } else {
            result = num1 - num2;
        }
        System.out.println("result = " + result);


    }
}
