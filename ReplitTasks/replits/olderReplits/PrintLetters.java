package replits.olderReplits;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        String str = "";

        for (int i = start; i <= end; i++) {
            str += i;
            System.out.print((char)i);
        }



    }
}

/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z
​
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example:

input:
a
f
 */