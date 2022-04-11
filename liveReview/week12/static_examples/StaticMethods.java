package week12.static_examples;

import java.util.Enumeration;

public class StaticMethods {

    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
     //   System.out.println(num); // we can not call instance variable from a static method

        System.out.println("count = " + count); // but from a static method we can call static
    }

    public void instanceMethod(){
        System.out.println("count = " + count); // we can call a static field from an instance method

        System.out.println("num = " + num);
        displayMessage("hello from instance method");
    }


}
