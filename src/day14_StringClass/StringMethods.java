package day14_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

/*        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
*/

        System.out.println("-----------------------------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);
        char lastChar = s1.charAt(s1.length()-1);
        //char lastChar = s1.charAt(25);
        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------------------------------");

        String name = "wooden spoon";
        name = name.toUpperCase();
        String nameX = name.toLowerCase();

        char letter = name.charAt(0);
        System.out.println("letter = " + letter);
        

        System.out.println("name = " + name);
        System.out.println("nameX = " + nameX);

        String name2 = "JAVA";
        String name3 = name2.toLowerCase();

        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);






    }

}
