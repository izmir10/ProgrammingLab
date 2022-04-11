package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);



        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter building number: ");
        String buildingNumber = input.next();

        input.nextLine();
        System.out.println("Enter street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter city name: ");
        String city = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.next();

        input.nextLine();
        System.out.println("Enter zip code: ");
        String zip = input.next();

        input.nextLine();
        System.out.println("Enter country name; ");
        String country = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);
        System.out.println("country = " + country);

        input.close();

    }
}
