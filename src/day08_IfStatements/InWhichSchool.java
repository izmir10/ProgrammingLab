package day08_IfStatements;

public class InWhichSchool {
    public static void main(String[] args) {
        byte age = 18;

        boolean elementary = age >=1 && age < 6;
        boolean middle = age >= 6 && age < 9;
        boolean high = age >= 9 && age < 13;
        boolean college = age >= 13 && age < 17;
        boolean grad = age >= 17 && age <= 18;

        if (elementary){
            System.out.println("Elementary School");}
        if (middle) {
            System.out.println("Middle School");}
        if (high) {
            System.out.println("High School");}
        if (college) {
            System.out.println("College");}
        if (grad) {
            System.out.println("Graduate School");}




        /*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18*/
    }
}
