package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter full fullName: ");
        String fullName = input.nextLine();


        System.out.println("Enter your programming language");
        String programmingLanguage = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();//Now we took out the "enter" that we used at the previous nextInt to clear the cache
        System.out.println("Enter your school name: ");
        String schoolName= input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);


    }
}
