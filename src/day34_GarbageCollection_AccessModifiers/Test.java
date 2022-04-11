package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("-----------------------------");

        // find sum of 10, 20
        int r1 = sum(10, 20);
        System.out.println(r1);


        // find sum of 100, 200
        int r2 = sum(100,200);
        System.out.println(r2);

        int r3 = subtract(100,50);
        System.out.println(r3);

        int max1 = max(1000, 2000);
        System.out.println(max1);


    }
}
