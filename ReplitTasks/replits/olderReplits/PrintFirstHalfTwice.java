package replits.olderReplits;

import java.util.Scanner;

public class PrintFirstHalfTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String result = word.substring(0, word.length()/2);
        System.out.println(result+result);



/*        String result = "";

        for (int i = 0; i < word.length()/2; i++) {
            String ch = ""+ word.charAt(i);
            result += ch;
        }
        System.out.println(result+result);
*/



    }
}

/*Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: java

output: jaja
input: unity

output: unun
*/