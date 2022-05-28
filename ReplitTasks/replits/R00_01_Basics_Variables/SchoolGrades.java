package replits.R00_01_Basics_Variables;
import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {

        String number1, number2, number3, number4, number5;
        double score1, score2, score3, score4, score5;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        number1 = input.next();
        score1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        number2 = input.next();
        score2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        number3 = input.next();
        score3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        number4 = input.next();
        score4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        number5 = input.next();
        score5 = input.nextDouble();

        double average = (score1+score2+score3+score4+score5)/5;

        System.out.println("Summary: "+number1 + " - " + score1 + ", " + number2 + " - " + score2 + ", " +number3 + " - " + score3 + ", "
                +number4 + " - " + score4 + ", " + number5 + " - " + score5);
        System.out.println("Your average score is: " + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
