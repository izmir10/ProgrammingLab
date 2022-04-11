package day09_IfStatements;

public class GradeReport2 {
    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
         */

        int score = 90; // 0 ~ 100
        String grade;

        boolean a = score >= 90 && score <= 100; //false
        boolean b = score >= 80 && score <= 89; //true
        //  boolean b = score >= 80 && !a; // if score is A, but score is greater than 80

        boolean c = score >= 70 && score <= 79; //false
        // boolean c =!a && !b && score >= 70

        boolean d = score >= 60 && score <= 69; // false

        boolean f = score >= 0 && score <= 59; // false
        //  boolean f = !a && !b && !c && !d;

        /*if (a) { //if the student made an A
            System.out.println("Excellent");
        } else if (b) { // if the student made a B
            System.out.println("Great");
        } else if (c) { // if the student made a C
            System.out.println("Good");
        } else if (d) { // if the student made a D
            System.out.println("Passed");
        } else { // if the student made F
            System.out.println("Failed");
        }*/

        if (a) { //if the student made an A
            grade = "Excellent";
        } else if (b) { // if the student made a B
            grade = "Great";
        } else if (c) { // if the student made a C
            grade = "Good";
        } else if (d) { // if the student made a D
            grade = "Passed";
        } else { // if the student made F
            grade = "Failed";
        }

        System.out.println("Your score = " + grade);

    }

}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */