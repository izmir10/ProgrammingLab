package day19_LoopPractices;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            double r = scan.nextDouble();
            double pi = 3.14;

            if (r <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            } else {
                System.out.println("Diameter: " + 2 * r);
                System.out.println("Perimeter: " + 2 * pi * r);
                System.out.println("Area: " + pi * r * r);
            }
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next().toLowerCase();

            if (answer.equalsIgnoreCase("no")){
                break;
            } while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
                System.err.println("Would you like to calculate another circle?");
                answer = scan.next().toLowerCase();

            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }


        }




    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */