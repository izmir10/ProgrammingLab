package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstCharacter = 100;
        int secondCharacter = 50;
        int addition = firstCharacter + secondCharacter;
        int subtraction = firstCharacter - secondCharacter;
        int multiplication = firstCharacter * secondCharacter;

        // 100 + 50 = 150
        // 100 - 50 = 50
        // 100 * 50 = 5000

        System.out.println(firstCharacter + " + " + secondCharacter + " = " + addition);
        System.out.println(firstCharacter + " - " + secondCharacter + " = " + subtraction);
        System.out.println(firstCharacter + " * " + secondCharacter + " = " + multiplication);


    }
}
