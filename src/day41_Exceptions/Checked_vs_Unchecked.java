package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        System.out.println("--------- Unchecked exception: ----------");

        int a = 10;
        int b= 0;

    //    System.out.println( a /b ); // exception occurred during the runtime
    //    System.out.println("Wooden Spoon"); // because f the previous line exception, this line will not be executed (program terminated)

        char[] characters = {'A', 'B', 'C'};

        // System.out.println(characters[99]); //max index number is 2, but we entered smth bigger. It will again give a runtime exception
        // System.out.println(characters.length); //3

        Student student = null;

        // System.out.println(student.getName());
        // student.study();

        String str = "Wooden Spoon";
        str = null; // str is collected by garbage collector. It does not exist anymore

         str.toUpperCase(); // you can not change to uppercase for a non-existing variable

        System.out.println("--------- Checked exception: ----------");

        System.out.println("Hello");

      //  Thread.sleep(3000);

        System.out.println("Cydeo");

      //  FileInputStream file = new FileInputStream("path of the file");




    }
}
