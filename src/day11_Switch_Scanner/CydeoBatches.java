package day11_Switch_Scanner;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usMorning;
        String usEvening;
        String eu;
        String batch = "";

        System.out.println("Enter the batch type: ");
        batch = input.nextLine();

//        boolean validBatches = batch == "usMorning" || batch == "usEvening" || batch == "eu";

        boolean validBatches = batch.equals("usMorning") || batch.equals("usEvening") || batch.equals("eu");

        switch (batch){
            case "usMorning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "usEvening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "eu":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("Ivalid batch");

        }

    }
}
