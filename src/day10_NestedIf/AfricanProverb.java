package day10_NestedIf;

import java.util.Scanner;

public class AfricanProverb {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Do you want to walk ... \na: Fast \tb. Far \tc. Fast and Far \td. I don't want to walk");

        System.out.println("\nMake your choice:");
        String answer = input.next();

        String result = (answer.equals("a")) ? "Walk alone" : (answer.equals("b")) ? "Walk together"
                : (answer.equals("c")) ? "Join the HALAY" : "I don't want to walk";

        System.out.println("result = " + result);

    }
}
