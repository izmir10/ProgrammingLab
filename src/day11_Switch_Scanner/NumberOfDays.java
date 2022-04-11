package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int year = 2024;
        int n = 2;
        String result = ""; // We mixed if statement, ternaries and switch statement and used altogether

        if (n >= 1 && n <= 12) {

            switch (n) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    // if (year % 4 == 0) {
                        //    System.out.println("29 days");
                    // } else {
                       // System.out.println("28 days");
                   // }
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                //System.out.println("30 days");
                    break;

                default: // 1,3,5,7,8,10,12
                    result = "31 days";
                    // System.out.println("31 days");

            }


        } else {
            System.out.println("Invalid number");
        }

        System.out.println(result);

    }
}
