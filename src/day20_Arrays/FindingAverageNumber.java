package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindingAverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();

            total += numbers[i];
        }

        double average = (total / length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("total = " + total);
        System.out.println("length = " + length);
        System.out.println("average = " + average);


    }
}
