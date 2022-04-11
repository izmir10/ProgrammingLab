package day08_IfStatements;

public class FindMaxNumber {
    public static void main(String[] args) {
        int n1 = 500, n2 = 500;

        boolean maximum1 = n1 > n2;
        boolean maximum2 = n1 < n2;
        boolean equal = n1 == n2;

        if (maximum1) {
            System.out.println(n1 + " is maximum");
        }
        if (maximum2) {
            System.out.println(n2 + " is maximum");
        }
        if (equal) {
            System.out.println(n1 + " and " + n2 + " are equal.");
        }


        /*3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				200 is maximum number*/

    }
}
