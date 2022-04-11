package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        //reverse the array

        int[] result = new int[array.length];
        int k = 0;

        for (int i = array.length - 1; i >= 0; i--, k++) {
            result[k] += array[i];
        }
        System.out.println("result = " + Arrays.toString(result));

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        //reverse this array list

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);
        }

        System.out.println("reversedList = " + reversedList);





    }
}
