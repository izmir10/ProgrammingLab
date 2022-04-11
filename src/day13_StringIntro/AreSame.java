package day13_StringIntro;

import java.util.Scanner;

public class AreSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordX = scan.nextLine();
        String wordY = scan.nextLine();
        String word1 = wordX+" "+wordY;

        String word2 = "one two";

        System.out.println(word1==word2);
        System.out.println(word1.equals(word2));

    }
}
