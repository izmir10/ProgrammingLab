package day08_IfStatements;

import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE:
        boolean equal = num1==num2;
        boolean num1Bigger = num1 >num2;
        boolean num2Bigger = !equal && !num1Bigger;

        if(equal){
            System.out.println(num1 + " and " + num2 + " are equal");}

    }
}
