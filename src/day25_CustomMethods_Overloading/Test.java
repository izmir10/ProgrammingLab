package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("---------------------------------");

        String s1 = "Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse); //noopS nedooW

        System.out.println("-----------------------------------");

        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("Palindrome? " + palindrome); //Palindrome? true

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("Count= " + count); //3

        System.out.println("----------------------------------------");

        String str1 = "karin";
        String str2 = "arkni";

        boolean anagram = StringUtility.anagram(str1, str2);
        System.out.println("anagram = " + anagram);

        System.out.println("---------------------------------------");

        String str3 = "aaaabbbbbcccccc";

        str3 = StringUtility.removeDuplicates(str3);
        System.out.println(str3); //"abc"



    }
}
