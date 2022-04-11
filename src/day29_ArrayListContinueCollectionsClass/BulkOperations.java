package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("------------adAll ---- asList ----------------");

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("---------------------removeAll-------------------");

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]

        System.out.println("--------------retainAll------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        numbers.retainAll(Arrays.asList(100, 200, 300)); //[100, 200, 300, 100, 200, 300]

        System.out.println(numbers);

        System.out.println("---------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles); //[QA, SDET, QA, SDET]

        System.out.println("---------------containsAll------------------");


        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10); //true ==> contains() method is for checking single/one element

        System.out.println("r1 = " + r1);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println("r2 = " + r2); //true

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10)); //containsAll() method can check multiple elements in the array

        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------------------");

        String[] names = {"James", "Jack", "Daniel", "Shay", "Breanna"}; //[James, Jack, Daniel, Shay, Breanna]

        System.out.println(Arrays.toString(names));

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); //[James, Jack, Daniel, Shay, Breanna]
/*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        System.out.println(namesList);
*/

        System.out.println("----------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10}; //===> primitive array

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); //==> I can't use this method for multiple primitive data
        //If it is an integer array ==> Integer[] arr ===> we can convert them into array list / collection

        System.out.println("---------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }



}
