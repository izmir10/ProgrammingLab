package replits.R05_Arrays;

import java.util.Scanner;

public class PrintFirstAndLastChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    //    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String[] words = new String[5];
        words[0]= "hello";
        words[1]= "why";
        words[2]= "by";
        words[3]= "apple";
        words[4]= "note";

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (int i = 0; i < words.length; i++) {
            //words[i].split("");
            System.out.println((words[i].charAt(0))+""+(words[i].charAt(words[i].length()-1)));
        }



    }
}

/*
Given a String array words, iterate through each word and print first and last letter of each
element in separate lines.

Example:
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */