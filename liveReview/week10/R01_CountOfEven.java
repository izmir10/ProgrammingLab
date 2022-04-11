package week10;

import java.util.Arrays;

public class R01_CountOfEven {

    public static void main(String[] args) {

        int[] arr = {2,5,6, 9, 10, 20, 7, 19};

        System.out.println(counter(arr)); //4

    }

    //will take parameter: int[]
    //will return a number: integer -even number-

    public static int counter(int[] array) {

        int count = 0;

        for (int each : array) {
            if (each % 2 == 0) {
                count++;
            }
        }
        return count;

    }

}
