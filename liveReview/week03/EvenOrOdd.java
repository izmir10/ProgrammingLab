package week03;

public class EvenOrOdd {
    public static void main(String[] args) {

        //Task: Find is a given integer is even number or odd number
        //Hint; use % operator and control flow statement

        int number= 100;

        boolean condition = number % 2 == 0;

        if (condition) {
            System.out.println("The number is an even number"); } else {
            System.out.println("The number is an odd number");}


    }
}
