package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your gender:"); //male or female
        String gender = scan.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry, please re-enter your gender");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Are you married?"); //yes or no
        String isMarried = scan.next().toLowerCase();

        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your civil status");
            isMarried = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:"); //no negative number or more than 120
        int age = scan.nextInt();

        while (!(age > 0 && age <= 120)) {
            System.err.println("Invalid entry, please re-enter your age");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive a year?");
        int miles = scan.nextInt();

        while (!(miles > 0 && miles >= 5)) {
            System.err.println("Invalid entry, please re-enter miles driven per day");
            miles = scan.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance? (liability or full)");
        String coverage = scan.next().toLowerCase();

        while (!(coverage.equals("liability") || coverage.equals("full"))){
            System.err.println("Invalid entry, please re-enter coverage choice (liability or full)");
            coverage = scan.next().toLowerCase();
        }

        System.out.println("Did you have any accidents of claims in the past 5 years? Yes or No");
        String accidents = scan.next().toLowerCase();

        while (!(accidents.equals("yes") || accidents.equals("no"))) {
            System.err.println("Invalid entry, please re-enter previous incidents information (yes or no)");
            accidents = scan.next().toLowerCase();
        }

        System.out.println("Do you have any anti-theft device in your vehicle? (Yes or no)");
        String antiTheft = scan.next().toLowerCase();

        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.err.println("Invalid entry, please re-enter if you have an anti-theft device (yes or no)");
            antiTheft = scan.next().toLowerCase();
        }

        double price = 0;

        if (coverage.equals("liability")) {
            price = age > 0 && age < 25 ? price = 90 : 50;

/*
        if (age > 0 && age < 25) {
            int startingPrice = 90;
        } else {
            int startingPrice = 50;
        }
*/

            price = miles <= 10 ? price + 10 : (miles > 10 && miles <= 50 ? price + 30
                    : price + 50);
        }

        if (coverage.equals("full")) {
            price = age > 0 && age < 25 ? price = 160 : 120;

            price = miles <= 10 ? price + 20 : (miles > 10 && miles <= 50 ? price + 40
                    : price + 70);
        }

        if (antiTheft.equals("yes")){
             price -= price*0.05;
        }

        if (accidents.equals("yes")){
            price += price*0.15;
        } else {
            price -= price*0.10;
        }

        if (isMarried.equals("yes")){
            price -= price*0.05;
        }

        System.out.println("Full name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Are you married? = " + isMarried);
        System.out.println("Age = " + age);
        System.out.println("Expected miles per year = " + miles);
        System.out.println("Preferred coverage = " + coverage);
        System.out.println("Previous accidents or claims = " + accidents);
        System.out.println("Do you have anti theft device? = " + antiTheft);
        System.out.println("Final price after discounts = $" + price);

        scan.close();
    }
}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?
			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
		Calculate the price of the insurance and display all the info of the user
			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50
					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50
				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120
					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70
			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */