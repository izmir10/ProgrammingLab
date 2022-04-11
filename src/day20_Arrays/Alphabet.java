package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; //Create a variable that can contain 26 characters Z~A

        /*        i     ch
        alphabets[0] = 'Z'; //on the ASCII table each character is represented by a number Z=90
        alphabets[1] = 'Y'; //ascii ==> Y=89
        alphabets[2] = 'X'; //X=88
            ...
         */

       /* char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }*/

        for (char i = 0, j = 'Z'; i < alphabets.length ; i++, j--) {
            alphabets[i] = j;
        }

        System.out.println(Arrays.toString(alphabets)); //prints the whole array
      //  System.out.println(alphabets[0]); //printing the element of array


    }
}
