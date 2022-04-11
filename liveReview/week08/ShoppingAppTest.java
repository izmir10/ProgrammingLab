package week08;

public class ShoppingAppTest {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---------Find the first index of 'Gloves' in items array-------------------");

        for (int i = 0; i < itemIDs.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {    // items[i]: Data type = String
                System.out.println("Gloves found at index : " + i);
                // System.exit(0);  //it exits from the whole main method
                break; //just to get out of the loop
            }

        }

        System.out.println("----------------Set a boolean variable true if 'ipad' exists in the items-------------");

        boolean iPadExists = false;

        for (String item : items) {
            if(item.equalsIgnoreCase("ipad")){
                iPadExists = true;
                break;
            }
        }

        if(iPadExists)
            System.out.println("We have iPad in the list");
        else
            System.out.println("iPad not found");


        System.out.println("-------------Look for 'Jacket' in items and if found print the details of the item-----------------");

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")){
                String itemDetail = items[i] + " - Price: $ " + prices[i] + " - Item ID: " + itemIDs[i];
                System.out.println("itemDetail = " + itemDetail);
                break;
            }
        }



    }
}
