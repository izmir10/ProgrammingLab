package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1); // removes the index
        System.out.println(list);

        list.remove((Integer.valueOf(1))); //removes the element
        System.out.println(list);


        // these both methods will be used at the automation
        // array to array list
        String[] array = {"red", "green", "blue"};

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        // array list to array
        String[] arrayTwo = new String[listTwo.size()];
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));



    }
}
