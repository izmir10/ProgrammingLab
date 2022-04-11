package day29_ArrayListContinueCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //Converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);
        System.out.println("list = " + list); //[Japan, Korea, Turkey, Canada]

        //Converting arrayList to array
        countries = list.toArray(new String[0]); //we can give any number [0] then it will change accordingly size of arrayList
        System.out.println("countries = " + Arrays.toString(countries)); //[Japan, Korea, Turkey, Canada]




    }
}
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */