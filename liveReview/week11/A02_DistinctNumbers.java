package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    public static void main(String[] args) {

        // it will get input from user, and only will store distinct numbers to our arraylist

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do{                                         // line 19-24 reads the values of user with a loop
            value = input.nextInt();
            if (value !=0 && !list.contains(value)){ // if arraylist does NOT contain and not equal to zero
                list.add(value);
            }
        } while (value != 0);

        for (Integer numbers : list){
            System.out.println(numbers + " ");
        }

        //get the size of the array
        System.out.println("The size of the array is: list.size()");

        //sort the array
        //we can use the Collections utility class which comes with many useful methods such as "sort"
        Collections.sort(list); //To use sort method your Object Class must be comparable

        System.out.println(list);

        //finding max and min numbers in the Array list
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.shuffle(list); //random shuffle
        System.out.println(list);


    }

}
