package replits.R02_Statements;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String answer = input.next();

        String a = "a", b = "b", c = "c";
        boolean validAnswer = answer.equals(a) || answer.equals(c) || answer.equals(c);

        if (validAnswer) {
            switch (answer) {
                case "a":
                    System.out.println(a + " is wrong");
                    break;
                case "b":
                    System.out.println(b + " is correct");
                    break;
                case "c":
                    System.out.println(c + " is wrong");
                    break;
                default:

            }
        } else {
            System.out.println(answer + " is not a valid answer");
        }


    }
}


/*In the given program you have a quiz question and a scanner to get the user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.

HINT
We did not learn "equals" method from String. In order to do this task with if-else if-else statements you need to know equals method. However you can try to solve this with Switch statement easily.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

b

b is correct
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

b

b is correct
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

c

c is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

c

c is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

z

z is not a valid answer*/