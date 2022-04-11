package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];

        int total = 0;

        for (int i = 0, j = 0; i < items.length; i++, j++) {

            System.out.println("Enter item name: ");
            items[i] = scan.nextLine();

            System.out.println("Enter price: ");
            prices[j] = scan.nextDouble();
            scan.nextLine();


        }

    //    System.out.println("items = " + Arrays.toString(items));
    //    System.out.println("prices = " + Arrays.toString(prices));

        for (int i = 0, j = 0; i < items.length; i++, j++) {
            System.out.println(items[i]+ " -- " + prices[j]);
        }




    }
}

/*
5. Items
1. Create an array named items with the length of 5
2. Create an array named prices with the length of 5
3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
4. calculate the total price of the arrays
5. display each item name and price in separate lines
ItemName -- Price
 */