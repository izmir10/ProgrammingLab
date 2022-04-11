package day13_StringIntro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("First entry:");
        String str1 = input.nextLine();

        System.out.println("Second entry");
        String str2 = input.nextLine();

        if (str1.length()>str2.length()){
            System.out.println(str1);
        } else if (str2.length()>str1.length()){
            System.out.println(str2);
        } else {
            System.out.println("Both have same length");
        }



        input.close();
    }
}
/*2. write a program that asks user to enter two strings, and print out the longest string*/