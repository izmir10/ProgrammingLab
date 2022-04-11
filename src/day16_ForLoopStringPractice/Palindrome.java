package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Level";

        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        if (isPalindrome){
            System.out.println(word + " is a palindrome word");
        } else {
            System.out.println(word + " is not a palindrome word");
        }


    }
}
