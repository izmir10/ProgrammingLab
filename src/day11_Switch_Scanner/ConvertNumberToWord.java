package day11_Switch_Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {

        int number = 0;
/*        if (number >= 0 && number <= 9) {
            if (number == 0) {
                System.out.println("Zero");
            } else if (number == 1) {
                System.out.println("One");
            } else if (number == 2) {
                System.out.println("Two");
            } else if (number == 3) {
                System.out.println("Three");
            } else if (number == 4) {
                System.out.println("Four");
            } else if (number == 5) {
                System.out.println("Five");
            } else if (number == 6) {
                System.out.println("Six");
            } else if (number == 7) {
                System.out.println("Seven");
            } else if (number == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
        } else {
            System.out.println("Invalid number");
        }*/

        System.out.println("--------------------------------");

        String result = (number >= 0 && number <= 9) ? (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two"
                : (number == 3) ? "Three" : (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six"
                : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine"

                : "Invalid number";

        System.out.println("result = " + result);


/*
	2. Write a program that can convert numbers 0~9 to words.
		NOTE: MUST use ternary
 */
    }
}
