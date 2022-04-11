package week01;

import java.util.Locale;
import java.util.Scanner;

public class CastingPractices {
    public static void main(String[] args) {

        /*
         * 1. Ask for a String input from user
         * 2. Create a method that will return a string, made of its first two chars in upper case,
         * so the String "Hello" yields “HE".
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a String");
        String str = scan.next();

        System.out.println(firstTwoChars(str));



    }

    public static String firstTwoChars(String str){

      //  str = str.toUpperCase().substring(0,2);


        return str.toUpperCase().substring(0,2);




    }

}
