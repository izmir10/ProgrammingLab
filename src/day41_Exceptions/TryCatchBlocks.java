package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test-1 started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try Block after");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");
            System.out.println("Arithmetic exception was occurred");
            e.printStackTrace();
        }

        System.out.println("Test-1 completed");


        System.out.println("--------------------------------------------");

        System.out.println("Test-2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch(RuntimeException e){  // It was ArrayIndexOutOfBoundsException but we used parent RunTimeException class

            e.printStackTrace();  // prints full reason of the exception
        //    System.out.println(e.getMessage());  //prints summary of the exception

        }

        System.out.println("Test-2 completed");

        System.out.println("Test-3 started");

        try {

            System.out.println("Cydeo".substring(2, 0));

        } catch(RuntimeException e){

            e.printStackTrace();

        }

        System.out.println("Test-3 completed");

        System.out.println("----------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("-------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
