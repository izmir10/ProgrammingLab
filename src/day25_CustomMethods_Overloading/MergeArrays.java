package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        
        int[] merged = merge(arr1, arr2);
        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged));

        double[] arr3 = {2.3, 4.6};
        double[] arr4 = {3.1, 6.3};

        double[] merged2 = merge(arr3,arr4);
        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged2));

        String[] name = {"Gabriel, Garcia, Marquez"};
        String[] title = {"Soledad", "De", "Cien", "Anos"};

        String[] myFavourite= merge(name, title);
        System.out.println("myFavourite is = " + Arrays.toString(myFavourite));





    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int temp = 0;

        for (int k : arr1) {
            merged[temp++] = k;
        }
        for (int j : arr2) {
            merged[temp++] = j;
        }

        return merged;

    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] merged = new double[arr1.length + arr2.length];
        int temp = 0;

        for (double k : arr1) {
            merged[temp++] = k;
        }
        for (double j : arr2) {
            merged[temp++] = j;
        }

        return merged;

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] merged = new String[arr1.length + arr2.length];
        int temp = 0;

        for (String k : arr1) {
            merged[temp++] = k;
        }
        for (String j : arr2) {
            merged[temp++] = j;
        }

        return merged;

    }
    
    
}
