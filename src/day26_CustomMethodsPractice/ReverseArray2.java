package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {


    public static int[] reverse(int[] array){

        int[] result = {}; //temporary array

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); //we are getting each element [i] from the last index and adding to the new array
        }                                                        //then re-assigning result to the new array
        return result;
    }


}
