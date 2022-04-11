package day11_Switch_Scanner;

public class GradeReport3 {
    public static void main(String[] args) {

        char grade = 'A';

        String result = "";

        switch (grade){
            case 'A': case 'B': case 'C': case 'D':
                result = "passed";
                break;
            case 'F':
                result = "failed";
                break;
            default:
                result = "invalid";

        }

        System.out.println(result);

    }
}
