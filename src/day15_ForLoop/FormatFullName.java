package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

       // Scanner input = new Scanner (System.in);
       // System.out.println("Enter first name:"); // "cyDEo"
       // String firstName = input.next();
       // System.out.println("Enter first name:"); //"SCHOOL"
       // String lastName = input.next();

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        // firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // System.out.println(firstName);

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


    }
}
/*
Write a program that asks user to enter first and last name, and then prints the full name
in regular format (firstName lastName
input:  firstName: "cyDEo"
        lastName: "SCHOOL";
output: Cydeo School
 */