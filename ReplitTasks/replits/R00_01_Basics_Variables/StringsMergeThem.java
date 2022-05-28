package replits.R00_01_Basics_Variables;

import java.util.Scanner;

public class StringsMergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

     //   String result = "";

        if (word1.length() == 3 && word2.length() == 3) {
/*            for (int i = 0; i < 3; i++) {
                result += word1.valueOf(word1.charAt(i)) + word2.valueOf(word2.charAt(i));
            }*/
            System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));

        } else {
            System.out.println("cannot merge");
        }


       // System.out.println(result);

        scan.close();

    }
}
/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol
​
Output:
alookl
Input:
aok
lol

Output:
alookl
Input:
ear
pie
​
Output:
epaire
Input:
ear
pie

Output:
epaire
Input:
java
wow
​
Output:
cannot merge
Input:
java
wow

Output:
cannot merge
hint:

by inserting +""+ (empty string) between chars, you can concatenate char values.
 */