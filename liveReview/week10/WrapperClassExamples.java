package week10;

import day16_ForLoopStringPractice.DigitsLettersSpecialChars;

public class WrapperClassExamples {

    public static void main(String[] args) {

        int i1 = 100;

        Integer i2 = i1; //(implicitly) changing a primitive data type to an object type (wrapper class type) ==> auto-boxing

        //explicit example:
        Long i3 = (long) i1;


        Integer n1 = 300;

        int n2 = n1; //(implicitly) changed a wrapper class object to a primitive data type ==> unboxing

        String str = "123";
        System.out.println(str + 1);//1231

        int num = Integer.parseInt(str);
        System.out.println(num + 1); //124

        String price = "$27.16";
        price = price.substring(1);

        double priceInDouble = Double.parseDouble(price);
        Double priceInWrapperDouble = Double.valueOf(price);

        System.out.println(priceInDouble); //27.16

        //Difference between Integer.parseInt(str) and Integer.valueOf(str)
        //Integer.parseInt(str) turns the value to primitive data type
        //Integer.valueOf(str) turns the value into WrapperClass

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2 + 1); //124

        System.out.println("---------------------");

        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit); //false

        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter); //true

        System.out.println("-------------------------");

        String strTwo = "a1b2c3"; //calculate sum of the integers inside the String (Interview Question)

        int sumOfDigits = 0;

        for (char each : strTwo.toCharArray()) {
            if (Character.isDigit(each)) {
                sumOfDigits += Integer.parseInt("" + each);
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits); //1+2+3 = 6

        System.out.println("----------------------------");

        String strThree = "abcd1234!@#$efghi6789#$%^ABCD"; //Analyse whole string, numbers of uppercases, lowercases, etc.

        String letters = "";
        String upperCaseLetters = "";
        String lowerCaseLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each :
                strThree.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;
                if (Character.isUpperCase(each)) {
                    upperCaseLetters += each;
                } else {
                    lowerCaseLetters += each;
                }
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }
}