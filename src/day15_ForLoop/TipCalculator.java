package day15_ForLoop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split?");
        String split = input.next().toLowerCase();

        System.out.println("Enter number of people:");
        int number = input.nextInt();

        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();

        System.out.println("How was the service quality");
        String quality = input.next().toLowerCase();

        double tipRate = (quality.equals("excellent")) ? 0.25 : (quality.equals("great")) ? 0.20 :
                (quality.equals("good")) ? 0.15 : (quality.equals("fair")) ? 0.10 :  0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered: " + number);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);

        if (split.equals("yes")){
            System.out.println("Total per person: " + (amount/number));
            System.out.println("Tip per person: " + (totalTip/number));
        }

        input.close();
    }
}
/*
if (split) {
            switch (quality) {
                case "Excellent":
                    System.out.println("Number of people entered: " + number);
                    System.out.println("Total to pay: " + ((check * 25 / 100) + check));
                    System.out.println("Total tip: " + (check * 25 / 100));
                    System.out.println("Total per person: " + (((check * 25 / 100) + check) / number));
                    System.out.println("Tip per person: " + ((check * 25 / 100) / number));
                    break;
                case "Great":
                    System.out.println("Number of people entered: " + number);
                    System.out.println("Total to pay: " + ((check * 20 / 100) + check));
                    System.out.println("Total tip: " + (check * 20 / 100));
                    System.out.println("Total per person: " + (((check * 20 / 100) + check) / number));
                    System.out.println("Tip per person: " + ((check * 20 / 100) / number));
                    break;
                case "Good":
                    System.out.println("Number of people entered: " + number);
                    System.out.println("Total to pay: " + ((check * 15 / 100) + check));
                    System.out.println("Total tip: " + (check * 15 / 100));
                    System.out.println("Total per person: " + (((check * 15 / 100) + check) / number));
                    System.out.println("Tip per person: " + ((check * 15 / 100) / number));
                    break;
                case "Fair":
                    System.out.println("Number of people entered: " + number);
                    System.out.println("Total to pay: " + ((check * 10 / 100) + check));
                    System.out.println("Total tip: " + (check * 10 / 100));
                    System.out.println("Total per person: " + (((check * 10 / 100) + check) / number));
                    System.out.println("Tip per person: " + ((check * 10 / 100) / number));
                    break;
                case "Poor":
                    System.out.println("Number of people entered: " + number);
                    System.out.println("Total to pay: " + ((check * 5 / 100) + check));
                    System.out.println("Total tip: " + (check * 5 / 100));
                    System.out.println("Total per person: " + (((check * 5 / 100) + check) / number));
                    System.out.println("Tip per person: " + ((check * 5 / 100) / number));
                    break;

                default:

            } else {
                switch (quality) {
                    case "Excellent":
                        System.out.println("Number of people entered: " + number);
                        System.out.println("Total to pay: " + ((check * 25 / 100) + check));
                        System.out.println("Total tip: " + (check * 25 / 100));
                        break;
                    case "Great":
                        System.out.println("Number of people entered: " + number);
                        System.out.println("Total to pay: " + ((check * 20 / 100) + check));
                        System.out.println("Total tip: " + (check * 20 / 100));
                        break;
                    case "Good":
                        System.out.println("Number of people entered: " + number);
                        System.out.println("Total to pay: " + ((check * 15 / 100) + check));
                        System.out.println("Total tip: " + (check * 15 / 100));
                        break;
                    case "Fair":
                        System.out.println("Number of people entered: " + number);
                        System.out.println("Total to pay: " + ((check * 10 / 100) + check));
                        System.out.println("Total tip: " + (check * 10 / 100));
                        break;
                    case "Poor":
                        System.out.println("Number of people entered: " + number);
                        System.out.println("Total to pay: " + ((check * 5 / 100) + check));
                        System.out.println("Total tip: " + (check * 5 / 100));
                        break;
                    default:
 */

/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */