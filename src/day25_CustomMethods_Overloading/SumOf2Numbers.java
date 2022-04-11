package day25_CustomMethods_Overloading;

public class SumOf2Numbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(2, 7);
        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(4, 9, 11);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(3, 23, 6, 76);
        System.out.println("sum3 = " + sum3);


    }

    public static int sumOf2Numbers(int num1, int num2) {

/*
        int sumOf2Numbers = num1 + num2;
        System.out.println("Sum Of 2 Numbers = " + sumOf2Numbers);
*/

        return num1+num2;

    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {

/*
        int sumOf3Numbers = num1 + num2 + num3;
        System.out.println("Sum Of 3 Numbers = " + sumOf3Numbers);
*/

        return num1+num2+num3;

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {

        return num1+num2+num3+num4;

    }


}


/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */