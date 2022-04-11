package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        //store 10, 20, 50, 70

        int [] numbers = {10, 20, 50, 70}; //size is set to 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------------------");

        //create a variable that can contain 5 scores

        int [] scores = new int[5];
        scores [1] = 85;
        scores [scores.length-1] = 95; //scores [4] = 95;
        scores [2] = 55;
        scores [0] = 65;
        scores [3] = 75;



        System.out.println(Arrays.toString(scores));





    }
}
