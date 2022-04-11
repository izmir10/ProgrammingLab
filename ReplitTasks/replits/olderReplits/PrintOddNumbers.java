package replits.olderReplits;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the last number");
        int num = scan.nextInt();

        String result = "";
        while (true) {
            if (num > 0) {
                for (int i = 0; i <= num; i++) {
                    if (i % 2 != 0) {
                        result += i + ", ";
                    }
                }
            } else {
                for (int i = 0; i >= num; i--) {
                    if (i % 2 != 0) {
                        result += i + ", ";
                    }
                }
            }
            break;
        }
        System.out.println(result.substring(0, result.length() - 2));
    }
}
/*
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
*/