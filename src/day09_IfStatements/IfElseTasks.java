package day09_IfStatements;

public class IfElseTasks {
    public static void main(String[] args) {
        int n1 = 12, n2 = 8;
        if (n1 > n2) {
            System.out.println(n1 + " is maximum");
        } else {
            System.out.println(n2 + " is maximum");
        }

        System.out.println("---------------------------------");

        int age = 13;
        if (age >= 18) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }

    }
}
