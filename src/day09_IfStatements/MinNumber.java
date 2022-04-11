package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int num1 = -21;
        int num2 = -27;

        boolean num1IsSmaller = num1 < num2;
        boolean num2IsSmaller = num2 < num1;
        boolean  numsAreEqual = num1 == num2;

        /*if(num1IsSmaller){
            System.out.println(num1 + " is the minimum number"); }
        if(num2IsSmaller){
            System.out.println(num2 + " is the minimum number"); }
        if(numsAreEqual){
            System.out.println(num1 + " and " + num2 + " are equal"); }*/

        if(num1<num2){
            System.out.println(num1 + " is the minimum number"); } //if num1 is the minimum number
        if(num2<num1){
            System.out.println(num2 + " is the minimum number"); } //if num2 is the minimum number
        if(num1==num2){
            System.out.println(num1 + " and " + num2 + " are equal"); } //if num1 and num2 are equal

    }

}
