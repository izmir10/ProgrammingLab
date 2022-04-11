package day13_StringIntro;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words:");
        String word = "";

        for (int i = 0; i < 3; i++) {
            word += scan.next() + " ";
        }
        word=word.trim();

        String word1 = word.substring(0, word.indexOf(" "));
        String word2 = word.substring(word.indexOf(" ") + 1, word.lastIndexOf(" "));
        String word3 = word.substring(word.lastIndexOf(" ") +1);

        int length1 = word1.length() - 1;
        int length2 = word2.length() - 1;
        int length3 = word3.length() - 1;

        if (length1 == length2 && length2 == length3) {
            System.out.println("All words are same length");
        } else if (length1 != length2 && length2 != length3) {
            System.out.println("All different length");
        } else {
            System.out.println("Not Same nor Different lengths");
        }

        System.out.println("word = " + word);
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
        System.out.println("word3 = " + word3);

        System.out.println("l1 = " + length1);
        System.out.println("l2 = " + length2);
        System.out.println("l3 = " + length3);

    }
}
/*7. Write a program  for CheckWords, the program accepts 3 words and :
        - if they are same length:  print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"
        */