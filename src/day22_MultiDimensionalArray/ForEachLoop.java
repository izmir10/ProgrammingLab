package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        //     |--->index:  0 1 2    0 1 2 3    0 1  2  3  4      <-- index numbers of the elements
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //  |---> index:      0          1             2        <-- index number of the arrays

        for ( int[] each1DArray : arr2D){

            for (int eachElement : each1DArray) {
                System.out.print(eachElement +" ");
            }

        }


    }
}
