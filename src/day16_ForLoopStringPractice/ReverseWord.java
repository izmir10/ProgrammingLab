package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "Java";
        String result = "";

/*        Scanner input = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        String result = "";
        */

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println("result = " + result);

        System.out.println("--------------------------------------------");

        String word = "Wooden Spoon";
        String result2 = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result2 += word.charAt(i);
        }
        System.out.println("result2 = " + result2);

        System.out.println("---------------------------------------------");

        String str2 = "I have a dream! Would you like to share it?";
        String firstPart = "", secondPart = "";

        firstPart = str2.substring(0, str2.indexOf("!")+1);
        secondPart = str2.substring(str2.indexOf("! ")+2);

        System.out.println("firstPart = " + firstPart);
        System.out.println("secondPart = " + secondPart);

        String result3 = "";
        String result4 = "";
        for (int i = firstPart.length()-1; i >= 0 ; i--) {
            result3 += firstPart.charAt(i);
        }
        for (int i = secondPart.length()-1; i >= 0 ; i--) {
            result4 += secondPart.charAt(i);
        }
        System.out.println(result3 + " " + result4);








    }
}
/*
7. Write a program that can reverse any given string
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */