package day34_GarbageCollection_AccessModifiers;

import day30_CustomClassIntro.Dog;
import day31_Constructors.Student;
import day32_ConstructorOverloading.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {

/*
        // int n = 3;
        // n = null;


        String str = null; // null can be assigned to only NON-PRIMITIVE data types
        System.out.println( str ); //null
        System.out.println( str.toUpperCase() ); // null pointer exception error
*/

        String str = "Wooden Spoon";

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("--------------------------------");

        Dog dog1 = new Dog();

        dog1.name = "Lucy";

        System.out.println(dog1);

        dog1 = new Dog();   // Dog Lucy is now unreferenced, so it is now eligible for garbage collection.
        dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("--------------------------------------");

        String language = "Python";

        language = "Java";

        System.out.println("------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200, 300, 400, 500));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("----------------------------------------------");

        Student student1 = new Student("Tahir", 34, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");


        // ArrayList<String> l2 = new ArrayList<>(); // we have two different objects with two different reference names
        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);






    }
}
