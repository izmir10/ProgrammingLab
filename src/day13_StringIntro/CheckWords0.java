package day13_StringIntro;

import java.util.Scanner;

public class CheckWords0 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words:"); // word1="one", word2="two", word3="three"

        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();


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


    }
}
/*7. Write a program  for CheckWords, the program accepts 3 words and :
        - if they are same length:  print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"
        */