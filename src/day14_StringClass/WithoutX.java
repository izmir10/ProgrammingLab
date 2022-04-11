package day14_StringClass;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
     //   String scan = "xcode";

        System.out.println("Enter the word:");
        String word = input.next();

        if (word.charAt(0) == 'x'){
         //   scan = scan.replaceFirst("x", "");
            word = word.substring(1);
        }
        System.out.println(word);


    }
}
