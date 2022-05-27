package day52_MapContinue;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");


        MySecondFunctionalInterface<Integer> cube = n -> {
            System.out.println("Cube of " + n + " is: " + + n*n*n);
        };

        cube.test(5);





    }
}
