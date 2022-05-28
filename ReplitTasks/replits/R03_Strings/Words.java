package replits.R03_Strings;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = "";

        for (int i = 0; i < 2; i++) {
            word += scan.next() + " ";
        }
        word=word.trim();

        String word1 = word.substring(0, word.indexOf(" "));
        String word2 = word.substring(word.lastIndexOf(" ") +1);

        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        } else {
            System.out.println("word1 does not equal word2");
        }



    }
}

/*In this assignment you are given two string variables word1 and word2.

Check if they are equal

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output "word1 equals word2"

otherwise output "word1 does not equal word2"

Input:
java
java

output:
word1 equals word2
Input:
java
java

output:
word1 equals word2
Input:
foo
bar

output:
word1 does not equal word2*/