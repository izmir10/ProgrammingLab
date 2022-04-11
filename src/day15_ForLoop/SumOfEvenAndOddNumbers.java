package day15_ForLoop;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {

        int sumOfEvenNumbers= 0;

        for (int i = 0; i <= 100 ; i++) {
            if (i%2==0){
                sumOfEvenNumbers += i;
            }

        }
        System.out.println("sumOfEvenNumbers = " + sumOfEvenNumbers);

        System.out.println("-------------------------------------------------");

        int sumOfOddNumbers= 0;

        for (int i = 0; i <= 100 ; i++) {
            if (i%2==1){
                sumOfOddNumbers += i;
            }

        }
        System.out.println("sumOfOddNumbers = " + sumOfOddNumbers);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int sum=0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
