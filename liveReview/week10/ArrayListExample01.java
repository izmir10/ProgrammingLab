package week10;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample01 {
    public static void main(String[] args) {

        //to show auto-boxing
        ArrayList<Integer> arr = new ArrayList<>();

        //ArrayList has flexible size, however it is slower comparing to Arrays
        //ArrayList comes with many useful methods

        for (int i = 0; i < 10; i++) {
            //How can I put primitives into array list? ==> with the help of auto-boxing
            arr.add(i);
        }

        System.out.println(arr);




    }
}
