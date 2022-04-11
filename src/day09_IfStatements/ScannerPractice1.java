package day09_IfStatements;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number= ");
        int number1 = input.nextInt();

        System.out.println("Enter a decimal number= ");
        double number2 = input.nextDouble();


        System.out.println("Are you happy? ");
        Boolean happyOrNot = input.nextBoolean();


        System.out.println("Enter your favourite colour= ");
        String colour = input.next();

        input.nextLine();

        System.out.println("Enter two animals that you like most= ");
        String twoAnimals = input.nextLine();


        System.out.println("Enter three numbers= ");
        String number3 = input.nextLine();


        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + (double) number2);
        System.out.println("happyOrNot = " + happyOrNot);
        System.out.println("colour = " + colour);
        System.out.println("twoAnimals = " + twoAnimals);
        System.out.println("number3 = " + number3);


    }
}
