package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = uniqueElements(array);
        System.out.println("unique = " + Arrays.toString(unique));

        System.out.println("-----------------------------------");

        double[] array2 = {1.5, 2.5, 5.5, 6.5, 3.5, 4.5, 2.5, 5.5, 6.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println("unique2 = " + Arrays. toString(unique2));



    }

    //finds the unique elements from a given array, returns a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ //we used the freq.ofElement to find the unique elements (if the freq is 1)
                result = ArraysUtility.addElement(result, each); //if the element is unique, added to the newly created array by using the variable at Array.utilities
            }
        }
        return result;
    }

    //finds the unique elements from a given array, returns a new double array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ //we used the freq.ofElement to find the unique elements (if the freq is 1)
                result = ArraysUtility.addElement(result, each); //if the element is unique, added to the newly created array by using the variable at Array.utilities
            }
        }
        return result;
    }

    //finds the unique elements from a given array, returns a new char array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ //we used the freq.ofElement to find the unique elements (if the freq is 1)
                result = ArraysUtility.addElement(result, each); //if the element is unique, added to the newly created array by using the variable at Array.utilities
            }
        }
        return result;
    }

    //finds the unique elements from a given array, returns a new String array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ //we used the freq.ofElement to find the unique elements (if the freq is 1)
                result = ArraysUtility.addElement(result, each); //if the element is unique, added to the newly created array by using the variable at Array.utilities
            }
        }
        return result;
    }
    
    

}
