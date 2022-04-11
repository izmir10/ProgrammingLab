package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 17;

        /*
        if (number ==1){
            System.out.println("Monday");
        }
        and goes on ... at IF statement
        */

        switch (number) {//1,2,3,4,5,6,7. == Switch' data can NOT be double, float, long, or boolean

            case 1: //case value must match with the switch' data type and must be UNIQUE
                System.out.println("Monday");
                break;  // exits the switch after executing the case block
                        // If you don't give the break statement, switch statement continue to execute the next block(s)
                        // until the break statement or } of the switch

            case 2:
                System.out.println("Tuesday");
                break; //exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: //only gets executed only if nine of the case blocks are matching
                System.out.println("Invalid");
                break; // we don't need to give break statement for the last block of the switch statement,
                        // because the closing curly brackets will cut/end the statementdd
        }

    }
}
