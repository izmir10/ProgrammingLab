package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the r");
        double r = input.nextDouble();

        double pi = 3.14;

        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        input.close();
    }
}
