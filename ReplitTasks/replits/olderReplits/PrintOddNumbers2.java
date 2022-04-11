package replits.olderReplits;

import java.util.Scanner;

public class PrintOddNumbers2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();

        while (number < 0) { //
            System.out.println("Enter a positive number: ");
            number = sc.nextInt();
        }

        //print next three numbers
        System.out.println("The next three numbers are: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(number + i);
        }

        System.out.println();



    }
}
/*
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
*/