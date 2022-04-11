package day10_NestedIf;

import java.util.Scanner;

public class NestedIfIntroPlusScanner {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        int score;

        System.out.println("Enter the exam score");
        int number1 = input1.nextInt();

        if (number1 >= 0 && number1 <= 100) {

            if (number1 >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");
        }


        System.out.println("-------------------------------------------");

        int age;
        boolean hasId = false;

        System.out.println("Dou you have an ID?");
        Scanner input3 = new Scanner(System.in);
        hasId = input3.nextBoolean();

        System.out.println("Please enter your age");
        Scanner input2 = new Scanner(System.in);
        age = input2.nextInt();


        if (hasId) {//if the person has id
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } else {
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("------------------------------------------------");


        System.out.println("Please enter the day number between 1-7");
        int dayNumber;
        Scanner input4 = new Scanner(System.in);
        dayNumber = input4.nextInt();

        if (dayNumber <= 7 && dayNumber >= 1) {
            if (dayNumber == 1) {
                System.out.println("Monday");
            } else if (dayNumber == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Friday");
            } else if (dayNumber == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }


        } else {
            System.out.println("Enter a valid day number");
        }


    }
}

