package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(5, 7);
        System.out.println("sum = " + sum);

    }

    //adds two different numbers
    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;

    }

    //adds three different numbers
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //adds four different numbers
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


}

/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */