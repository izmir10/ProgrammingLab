package day15_ForLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        System.out.println("-------------FOR LOOP--------------");
        Scanner input = new Scanner (System.in);

    //    System.out.println("Enter the word: ");
    //    String word = input.nextLine();
        String word = "Hello World";

        for (int i = 1 ; i <= 5 ; i++){
            System.out.println(word);
        }

        System.out.println("-----------------------WHILE LOOP-------------------");

        // System.out.println("Enter a number: ");
        // int i = input.nextInt();

        int i = 5;

        while (i <= 10){ //will print until 10th time
            System.out.println("Hello world");
            i++;
        }

        System.out.println("---------------DO...WHILE----------------");

        // System.out.println("Enter a number");
        // int i2 = input.nextInt();

        int i2 = 5;

        do {
            System.out.println("I am pissed off");
            i2++;
        } while(i2 < 7 );

        System.out.println("------------------NESTED LOOP-------------------");


        for (int m = 1; m<= 5; m++){
            for (int k = 1; k<= 5; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }




        input.close();
    }


}
