package replits.statements;

import java.util.Scanner;

public class HappyValleySchool {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        //WRITE YOUR CODE HERE

        String result = (age < 2) ? "ineligible" : (age == 2) ? "toddler" : (age >=3 && age <=5)? "early childhood" :
                (age >=6 && age <=7) ? "young reader" : (age >=8 && age <=10) ? "elementary" : (age >=1 && age <=12) ? "middle"
                        :(age ==13) ? "impossible" : (age >=14 && age <=16) ? "high school" : (age >=17 && age <=18) ? "scholar" : "ineligible";

        System.out.println(result);

        input.close();

    }
}

/*
In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
Given age print out the category the student would fall under

Example:

Enter age:
8

elementary
*/