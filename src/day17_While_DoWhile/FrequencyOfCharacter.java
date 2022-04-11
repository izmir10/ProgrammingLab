package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBCCAAAAAAAAAAAAAAAAA";
        char ch = 'B';

        int frequency = 0;


        for (int i = 0; i < str.length(); i++) { //i=indexes of str
            char eachChar = str.charAt(i);  // each character of str

            if (ch == eachChar){ //if given char is matching with the  eachChar, then ch is appeared in the string
                frequency++;
                // frequency += 1;
            }
        }
        System.out.println("frequency = " + frequency);

    }
    }

//Write a program that can return the frequency of a character from a String
