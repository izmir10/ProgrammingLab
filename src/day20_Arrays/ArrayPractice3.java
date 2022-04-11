package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        // ask the user how many numbers he wants to enter
        // once user provides the number, ask user to enter five inputs and store them

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); //10
        if (length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; //array needs to have enough capacity to contain all the elements user will enter

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();


    }
}
