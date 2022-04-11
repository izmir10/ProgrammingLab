package day10_NestedIf;

import java.util.Scanner;

public class GradeReportPlusScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the score");
        int score = input.nextInt();


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

        System.out.println("------------------------------------------------------");

        Scanner input2 = new Scanner(System.in);


        System.out.println("Please enter the score");
        int score2 = input2.nextInt();

        String result = "";

        if (score2 >= 0 && score2 <= 100) {
            if (score2 >= 90) {
                result = "Excellent";
            } else if (score2 >= 80) {
                result = "Great";
            } else if (score2 >= 70) {
                result = "Good";
            } else if (score2 >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid score!";
        }
        System.out.println(result);

    }
}
