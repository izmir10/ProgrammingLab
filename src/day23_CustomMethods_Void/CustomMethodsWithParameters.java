package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(98);
        oddOrEven(103);
        System.out.println("---------------------");
        ageOfPerson(1979);
        System.out.println("-----------------------");
        printNumbers(21, 45);

    }


    //create a function that can check if the numbers is odd or even number
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    //create a function that can display age of the person
    public static void ageOfPerson(int birthYear) {

        System.out.println(2022 - birthYear);

    }
    
    //crete a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i <= y; i++) {
            System.out.print(i+ " ");
        }

    }


}
