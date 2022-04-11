package day15_ForLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class replaceX {
    public static void main(String[] args) {
        System.out.println("Please enter a word:");
        Scanner input = new Scanner (System.in);

        // String str = input.next();

         String str = "xcodeX";

        String result = str.replace("x", "a").replace("X", "a");
        System.out.println(result);





    }
}
/*
Write a program that asks user to enter a word and replace all the x or X with character a
Input: xcodeX
Output: acodea
 */