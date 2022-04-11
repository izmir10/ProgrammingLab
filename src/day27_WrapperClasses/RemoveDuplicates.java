package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,3,5,6,4,3,2,2,7}; //arr = [1, 2, 3, 4, 5, 6, 7]

        arr = removeDuplicates(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("--------------------------------");

        String[] str = {"Java", "C#", "C#", "Java", "Python"};
        str = removeDuplicates(str);
        System.out.println(Arrays.toString(str)); //[Java, C#, Python]

        System.out.println("-------------STREAM----SHORTCUT---DON'T USE FOR NOW---------------------------");

        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,5};

        numbers = Arrays.stream(numbers).distinct().toArray();

        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 4, 5]


    }

    //removes the duplicates from a given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from a given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from a given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from a given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



}
