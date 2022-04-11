package day10_NestedIf;

import java.util.Scanner;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 85;


        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid score!");
        }

        System.out.println("--------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int grade = input.nextInt();

        String result = (grade >= 0 && grade <= 100) ? (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great"
                : (grade >= 70) ? "Good" : (grade >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println("result = " + result);

        System.out.println("----------------------------------");

        //Solution 3 - Mixed method

        String result2 = "";

        if (score >= 0 && score <= 100) {
            result2 = (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great" : (grade >= 70) ? "Good"
                    : (grade >= 60) ? "Passed" : "Failed";

        } else {
            System.out.println("Invalid score!");
        }

        System.out.println("result2 = " + result2);
    }
}
