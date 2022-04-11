package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        System.out.println("------------------------ toString ----------------------------");

        int[] nums = {1,2,3,4,5}; //array is not a method, so we can not directly print it

        System.out.println(nums); //we get this hash code: [I@2f7c7260 Ee must convert the array to object with
        System.out.println(Arrays.toString(nums)); // (toString) explicitly from utility of the array class
                                                   // any single dimensional array must be converted!

        System.out.println(nums[0]); // --> 1

        System.out.println("-------------------- SORT ------------------------------");

        // sort() method = sorts the elements in ascending order (a~z, A~Z, 0~9)

        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores)); //[95, 100, 55, 65, 85, 78]

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores)); //[55, 65, 78, 85, 95, 100]


        System.out.println("Min Score: " + scores[0]); //55
        System.out.println("Max score: " + scores[scores.length-1]); //100


        String[] names = {"Gunay", "Anna", "Zuhal", "ahmet", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); //--> Ascending order [Ahmet, Anna, Gunay, Maria, Sinem, Zuhal]

        System.out.println("------------------------ EQUALS -----------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2); // false
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2); // true
        System.out.println(r2);

        System.out.println("------------------ ANAGRAM? ------------------------");

        char[] ch1 = {'a','c', 'b'};
        char[] ch2 = {'b','a', 'c'};

        Arrays.sort(ch1); // a,b,c
        Arrays.sort(ch2); // a,b,c

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("Is anagram? = " + anagram);









    }

}
