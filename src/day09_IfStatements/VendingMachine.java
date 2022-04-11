package day09_IfStatements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
        int cents= scan.nextInt();
        int quarters, dimes, nickels, pennies;

        if(cents>0 && cents<100){
            quarters= cents/25;
            cents = cents - quarters*25;

            dimes = cents/10;
            cents = cents - dimes*10;

            nickels = cents/5;
            cents = cents- nickels*5;

            pennies = cents;

            System.out.println("Your change is "+ quarters+ " quarters, " + dimes +" dimes, "+ nickels + " nickels, "+ "and " +pennies + " pennies");


        }

        else{
            System.out.println("Invalid cents amount");
        }

    }
}
