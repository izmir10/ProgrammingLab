package replits.R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting01 {
    public static void main(String[] args) {
     //   Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        arr[0]= "hello";
        arr[1]= "how";
        arr[2]= "are";
        arr[3]= "you";
        arr[4]= "doing";


    /*    for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }*/
        //leave above alone!  write your code below.
        //Create another loop for your solution!


        for (int i = 0; i < arr.length; i++) {
            arr[i].split("");
            System.out.println(arr[i].substring(0,3));
        }


        System.out.println(Arrays.toString(arr));


    }
}

/*
The code provided in your main method will take in five Strings and save them into an array called arr.
Print out the first three letter of each element on separate lines.
You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doing
 */