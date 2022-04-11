package day20_Arrays;

import java.util.Arrays;

public class Months {
    public static void main(String[] args) {

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        int number = 7;

        if (number<0 || number>12){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        System.out.println(months[number-1]);

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < months.length; i++) { //i represent the index numbers of array starting from 0
            System.out.println(months[i]);
        }

        System.out.println("------------------------------------------------------");

        for (int i = months.length-1 ; i >= 0; i--) { //i represent the index numbers of array starting from last index
            System.out.print(months[i]+" ");
        }



    }
}
