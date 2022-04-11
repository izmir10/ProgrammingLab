package day09_IfStatements;
import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSeconds, hours, minutes, seconds;
        inputSeconds = input.nextInt();

        seconds = inputSeconds;

        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");





    }
}
