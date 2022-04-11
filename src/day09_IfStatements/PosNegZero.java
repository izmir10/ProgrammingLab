package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {
        int number = -10;

        boolean Positive = number > 0;
        boolean Negative = number < 0;
        boolean Zero =  number == 0;

        if(Positive) {
            System.out.println(number + " is positive number");
        }else if (Negative) {
            System.out.println(number + " is negative number");
        }else {
            System.out.println(number + " is zero");
        }

    }

}
/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
