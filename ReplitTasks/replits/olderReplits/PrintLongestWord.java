package replits.olderReplits;

import java.util.Scanner;

public class PrintLongestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE

        if (word1.length() != word2.length()) {
            if (word1.length() > word2.length()){
                System.out.println(word1);
            } else {
                System.out.println(word2);
            }
        } else {
            System.out.println("Same length");
        }


    }
}
/*Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different

input:
bill
check
input:
bill
check
output: check
*/