package week02;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2022;
        String make = "Volvo";
        String model = "V90";
        boolean transmission = true;
        String color = "White";
        int milage = 0;
        int price = 100_000; //Euros

        System.out.println(year + " " + make + " " + model + "\nAutomatic Transmission : " + transmission + " ");
        System.out.println(color + "|" + milage + " kilometers |" + price + " Euros");

        // 1 Euro = 15.5 Tl
        double priceInTl = price * 15.5;

        double taxRate = 1.80;

        double priceAfterTaxInTL = priceInTl * 1.8;

        System.out.println();
        System.out.println(year + " " + make + " " + model + "\nAutomatic Transmission : " + transmission + " ");
        System.out.println(color + "|" + milage + " kilometers |" + "price in TL: " + priceInTl + " TL" +
                " (price after tax in TL is: " + priceAfterTaxInTL + ")");





    }

}
