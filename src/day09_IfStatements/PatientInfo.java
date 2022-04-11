package day09_IfStatements;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        String firstName,
                lastName,
                fullName,
                email,
                street,
                state,
                city,
                address,
                contacts;
        int age,
                zipcode;
        double height,
                weight;
        boolean isMarried;
        long workPhoneNumber,
                personalPhoneNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!" + "\nPlease enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ",  email: " + email;
        fullName = "Full name: " + lastName + ", " + firstName;
        address = "Address: " + street + ", " + city + ", " + state +" " + zipcode;

        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);

    }
}
