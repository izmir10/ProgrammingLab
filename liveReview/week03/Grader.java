package week03;

public class Grader {
    public static void main(String[] args) {
        //for a given grade assign letter grades
        //100-90: A, 89-80:B, 79-70:C

        int grade = 101;

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Invalid value");
        }


    }
}
