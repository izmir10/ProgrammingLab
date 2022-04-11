package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.lang.reflect.Array;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D', 'E'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------------------------");

        String[] arr4 = {"Wooden Spoon", "Java Programming", "Nadia", "Hasan"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------------------------");

        int[] arr5 = {32, 4, 55, 37, 87, 65, -23, 97};
        int max1 = ArraysUtility.max(arr5);
        System.out.println("max1 = " + max1);

        int min1 = ArraysUtility.min(arr5);
        System.out.println("min1 = " + min1);

        System.out.println("---------------------------------------");

        double[] arr6 = {2.4, 5.6, 5.1, 7,8, 9.4, 5.9};
        double max2 = ArraysUtility.max(arr6);
        System.out.println("max2 = " + max2);

        double min2 = ArraysUtility.min(arr6);
        System.out.println("min2 = " + min2);

        System.out.println("---------------------------------------");

        int[] arr7 = {32, 4, 55, 37, 87, 65, -23, 97};

        boolean contains1 = ArraysUtility.contains(arr7, 37);
        System.out.println("contains integer? = " + contains1);

        System.out.println("---------------------------------------");

        double[] arr8 = {2.4, 5.6, 5.1, 7,8, 9.4, 5.9};

        boolean contains2 = ArraysUtility.contains(arr8, 5.6);
        System.out.println("contains double? = " + contains2);

        System.out.println("---------------------------------------");

        char[] arr9 = {'A', 'B', 'C', 'D', 'E'};

        boolean contains3 = ArraysUtility.contains(arr9, 'G');
        System.out.println("contains char? = " + contains3);

        System.out.println("---------------------------------------");

        String[] names = {"Wooden Spoon", "Java Programming", "Nadia", "Hasan"};

        boolean contains4 = ArraysUtility.contains(names, "nadia");
        System.out.println("String contains name? = " + contains4);







    }

}
