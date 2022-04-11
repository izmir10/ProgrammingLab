package day11_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.println("First number");
        n1 = input.nextDouble();
        System.out.println("Second number");
        n2 = input.nextDouble();

        char operator = '+';
        boolean valid = operator == '+' || operator == '-' || operator == '/' || operator == '*';

        System.out.println("Enter operator");
     //   operator = input.next();

        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                default:
                    System.out.println(n1*n2);

            }
        } else {
            System.out.println("Invalid Operator: " + operator);
        }

    }
}
