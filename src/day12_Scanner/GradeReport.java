package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = input.nextInt();
        String result = "";


        if (score >=0 || score <=100) {
            if (score >=90) {
                result = "A";
            } else if (score >= 80){
                result="B";
            } else if (score>= 70){
                result="C";
            } else if (score>=60){
                result="D";
            } else {
                result="E";
            }


        } else {
            System.out.println("Invalid score");
        }

        System.out.println("result = " + result);

    }
}
