package week09;

import java.util.Arrays;

public class R01_ArraysBinarySearch {
    public static void main(String[] args) {


        System.out.println("-------------------Arrays.binarySearch()--------------------");

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421, 23};

        int indexOne = Arrays.binarySearch(nums, 23); //this statement returns index of 23

        System.out.println("indexOne = " + indexOne); // 1

        System.out.println(Arrays.binarySearch(nums, 2344)); // 4

        System.out.println(Arrays.binarySearch(nums, 25)); // -3 minus means that this number does not exist in the list

        if (Arrays.binarySearch(nums, 12346)>=0){
            System.out.println("12346 is present in the array");
        } else {
            System.out.println("12346 is not in the array");
        }


    }
}
