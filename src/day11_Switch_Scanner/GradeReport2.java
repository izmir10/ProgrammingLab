package day11_Switch_Scanner;

public class GradeReport2 {
    public static void main(String[] args) {

        char grade = 'A';

        String result = "";

        switch (grade){
            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "great job";
                break;
            case 'C':
                result = "good";
                break;
            case 'D':
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
