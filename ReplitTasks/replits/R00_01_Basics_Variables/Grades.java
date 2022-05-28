package replits.R00_01_Basics_Variables;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        int grade = 0;

        Scanner input = new Scanner(System.in);
        grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("excellent");
        }



    }
}
