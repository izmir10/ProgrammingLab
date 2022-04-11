package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonth2 {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


       /* if (number >= 1 && number <= 12) {//if the number is valid

            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }

        } else { //if the number is invalid
            result = "Invalid number";*/

        String result = (n == 1) ? "January" : (n == 2) ? "February" : (n == 3) ? "March" : (n == 4) ? "April"
                : (n == 5) ? "May" : (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? "August"
                : (n == 9) ? "September" : (n == 10) ? "October" : (n == 11) ? "November" : (n == 12) ? "December" :
                "Invalid result";

        System.out.println("result = " + result);


    }
}
