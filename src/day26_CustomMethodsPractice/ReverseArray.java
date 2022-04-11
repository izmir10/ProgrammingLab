package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array = reverse(array);
        System.out.println("array = " + Arrays.toString(array));

    }

    //reverses the given array, returns a new int array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        //int j = 0; //instead of declaring result's index number -j- outside, we declared inside the loop

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new double array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        //int j = 0; //instead of declaring result's index number -j- outside, we declared inside the loop

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new char array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        //int j = 0; //instead of declaring result's index number -j- outside, we declared inside the loop

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new String array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        //int j = 0; //instead of declaring result's index number -j- outside, we declared inside the loop

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }





}
