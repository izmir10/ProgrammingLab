package day49_CollectionContinue;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

      //  arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
    //  ==> [Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
    //  ==> [Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]

/*        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(arr));

        arr = set1.toArray(new String[0]);

        System.out.println("set1 = " + set1);

        */

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<> ( new TreeSet<>(list) );

        System.out.println(list);


        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s =new ArrayList<>( Arrays.asList(array) );

        s.addAll(  Arrays.asList("E", "F", "G" )  );

        System.out.println("-----------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */



        System.out.println("------------------------------------------------");

        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddd";

        //  eabcd
        //  54434


        String result = ""; //e5a4b4c4d4


        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
        }


        System.out.println(result);


        System.out.println("----------------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println( names.toArray(new String[0])[2] );

        System.out.println( new ArrayList<>(names).get(4)  );


        for(String each : names ){
            System.out.println(each);
        }


    }
}
