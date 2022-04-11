package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*1. Create a class called ShippingAddress.java
         * 2. Declare the following variables:
         *       1. name
         *       2. buildingNumber
         *       3. streetName
         *       4. city
         *       5. state
         *       6. zipCode*/

        /*
        String name = "Aaron Smith";
        String buildingNumber = "5645";
        String streetName = "Stockbridge Road";
        String city = "Denton";
        String state = "TX";
        String zipCode = "76209";
        */

        String name = "\nJames Smith",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode;

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode);

        System.out.println(shippingAddress);


    }
}

