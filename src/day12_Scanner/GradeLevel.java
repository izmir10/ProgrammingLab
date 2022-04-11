package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        byte age = input.nextByte();
        String result = "";

        boolean validAge = age >= 1 && age <= 18;

 /*       if (validAge) {

            switch (age) {
                case 6: case 7: case 8:
                    result = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;

                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad school";
                    break;

                default:
                    result = "Elementary school";

            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);
*/

        switch (age) {
            case 1: case 2: case 3: case 4: case 5:
                result = "Elementary School";
                break;
            case 6: case 7: case 8:
                result = "Middle school";
                break;
            case 9: case 10: case 11: case 12:
                result = "High school";
                break;
            case 13: case 14: case 15: case 16:
                result = "College";
                break;
            case 17: case 18:
                result = "Grad school";
                break;

            default:
                System.err.println("Invalid entry");
        }
        System.out.println(result);

    }
}