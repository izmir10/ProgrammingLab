package replits.R02_Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter item: ");
        String item = input.nextLine();

        int amount = 100;
        int blanket = 60, charger = 25, hat = 25, headphones = 30, pants = 50, pillow = 40,
                socks = 5, usbCable = 10, smartphone = 2000, laptop = 200;

        boolean validItems = item.equals("Blanket") || item.equals("Charger") || item.equals("Hat") ||
                item.equals("Headphones") || item.equals("Pants") || item.equals("Pillow") || item.equals("Socks")
                || item.equals("USB cable") || item.equals("Smartphone") || item.equals("Laptop");

        if (validItems) {
            switch (item) {
                case "Blanket":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - blanket) + "$");
                    break;
                case "Charger":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - charger) + "$");
                    break;
                case "Hat":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - hat) + "$");
                    break;
                case "Headphones":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - headphones) + "$");
                    break;
                case "Pants":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - pants) + "$");
                    break;
                case "Pillow":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - pillow) + "$");
                    break;
                case "Socks":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - socks) + "$");
                    break;
                case "USB cable":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (amount - usbCable) + "$");
                    break;
                default:
                    System.out.println("Sorry, not enough funds on your gift card!");
                    break;

            }

        } else {
            System.out.println("Invalid item!");
        }

        input.close();
    }
}
