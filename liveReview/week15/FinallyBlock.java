package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println("You entered : " + num);
        }catch (InputMismatchException e){
            System.out.println("You entered an invalid value!");
        }finally{
            scan.close(); // close and clean up scanner
            System.out.println("Finally block ==> runs always");
        }

    }
}
