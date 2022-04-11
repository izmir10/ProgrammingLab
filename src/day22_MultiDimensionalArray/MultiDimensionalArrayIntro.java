package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1 = {"John", "Max", "Rick", "Sally"};
        String[] group2 = {"Jane", "Hulk", "Anna"};
        String[] group3 = {"Gary", "Stef", "Chris"};

        String [][] groups = new String[3][]; //index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        // System.out.println(Arrays.toString(groups)); //toString() method is for single dimensional arrays only
        System.out.println(Arrays.deepToString(groups)); //we use deepToString() method


        System.out.println("------------------------------------------------------");

        //     |--->index:  0 1 2    0 1 2 3    0 1  2  3  4      <-- index numbers of the elements
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //  |---> index:      0          1             2        <-- index number of the arrays

        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(arr2D[1])); //[4, 5, 6, 7]

        System.out.println( arr2D[2][3] ); //11



    }
}

/*
String[] group1 = {"John", "Max", "Rick"};
String[] group2 = {"Jane", "Hulk", "Anna"};
String[] group3 = {"Gary", "Stef", "Chris"};
 */