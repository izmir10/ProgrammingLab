package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char [26];
        /*
        letters [0] = 'A';
        letters [1] = 'B';
        */

        /*
        for (char i = 0, j = 'A'; i < letters.length ; i++, j++) { // i = index numbers 0 to last index
            letters [i] = (char) j;                                       // j = index of char A to Z
        }
        */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters [i] = ch++;
        }


        System.out.println(Arrays.toString(letters));  // A to Z


        System.out.println("-----------------------------------------------------");

        char [] letters2 = new char [26];  //Z ~ A

        char ch2='A';
        for (int i = 0; i < letters2.length ; i++) {
            letters2 [i] = ch2++;
        }

        System.out.println(Arrays.toString(letters2));


    }
}
