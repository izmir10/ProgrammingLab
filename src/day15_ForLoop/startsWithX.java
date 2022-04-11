package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {

    public static void main(String[] args) {

        System.out.println("Please enter a word:");
        String word = new Scanner(System.in).next(); //xcodex

        if (word.charAt(0) == 'x');{
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);

    }
}
/*
Write a program that asks user to enter a word. If the word starts with x, replace it with a.
input: xcodex
output: acodex
 */