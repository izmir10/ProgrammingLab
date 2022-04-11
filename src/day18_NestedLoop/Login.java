package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();


        if (u.equals(username) && p.equals(password)) { //if the credentials are valid
            System.out.println("lLogged in");
        } else {                                        //if the credentials are not valid
            int attempts = 3;
            while (!(u.equals(username) && p.equals(password)) && attempts > 0) { //if the credentials are invalid and user still has attempts
                if (attempts==1){
                    System.err.println("THIS IS YOUR LAST CHANCE");
                }
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }
        }
        if (u.equals(username) && p.equals(password)) {
            System.out.println("Logged in");
        } else {
            System.err.println("Your account is locked");
        }

        scan.close();

    }
}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */