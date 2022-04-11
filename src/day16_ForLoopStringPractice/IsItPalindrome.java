package day16_ForLoopStringPractice;

import java.util.Locale;
import java.util.Scanner;

public class IsItPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your word or sentence:");
        String str0 = scan.nextLine();

//        String str0 = "Ey edip adanada pide ye";
        String str = str0.toLowerCase();

        String result = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        if (result.equals(str)){
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }


    }
}
