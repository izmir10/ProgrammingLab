package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi; // = 3.14;
    public static String name; // = "Circle";

    public static ArrayList<Integer> numbers;


    public Circle(double radius){
        this.radius = radius;
      //  pi = 3.14; It will accept but do not do this. Constructors are for instances, not for statics

    }

    static{
        // radius = 5; // static block does not accept instances
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }


/*    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);


    }*/

}


