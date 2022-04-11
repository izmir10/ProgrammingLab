package day13_StringIntro;

import java.util.Scanner;

public class SameFirstAndLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word:");
        String str = scan.next();

        if (str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("First and last characters are same");
        } else {
            System.out.println("First and last characters are NOT same");
        }


            scan.close();
    }
}
/*3. write a program that can check if the first and last characters of the string are same
ex:level
output:same*/