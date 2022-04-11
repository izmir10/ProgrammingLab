package day12_Scanner;
import java.util.Scanner;
//import java.util.*; Wild Import --> * <-- will import everything from the package.

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1-7:");

        int number = input.nextInt();

        String result = "";

/*        if (number>=1 && number <=7) {

            switch (number) {
                case 1: result = "Monday";
                break;
                case 2: result = "Tuesday";
                    break;
                case 3: result = "Wednesday";
                    break;
                case 4: result = "Thursday";
                    break;
                case 5: result = "Friday";
                    break;
                case 6: result = "Saturday";
                    break;
                default: result = "Sunday";
                    break;

            }
        } else {
            result="Invalid number";
        }
        */ //switch method

        if (number>=1 && number <=7) {
            result = (number==1) ? "Monday" : (number==2) ? "Tuesday" : (number==3) ? "Wednesday" :
                    (number==4) ? "Thursday" : (number==5) ? "Friday" : (number==6) ? "Saturday" : "Sunday";
        } else {
            result = "invalid Number";
        }


        System.out.println("result = " + result);

        input.close(); //closes the Scanner
    }
}
