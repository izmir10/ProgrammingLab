package day13_StringIntro;

import java.util.Scanner;

public class InitialsOfUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first and last name:");
        String name = scan.nextLine();
        char first = name.charAt(0);
        char last = name.charAt(name.indexOf(" ")+1);

        System.out.println(first+"."+last);


        scan.close();
    }
}
/*4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output*/