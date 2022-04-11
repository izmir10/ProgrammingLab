package day30_CustomClassIntro;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        System.out.println("--------------swap first and elements---------------------");
        ArrayList<String> paintings = new ArrayList<>();
        paintings.addAll(Arrays.asList("Mona Lisa", "The Last Supper", "The Starry Night", "Girl With A Pearl Earring", "Whistler's Mother"));

        Collections.swap(paintings, 0, paintings.size() - 1);
        System.out.println("Paintings = " + paintings);

        System.out.println("------------move elements to the end-----------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int size = list.size(); //we find the size of the arrayList

        list.removeAll(Arrays.asList(0)); // we removed all the 0's from the arrayList

        int newSize = list.size(); //we find the new size and subtract from the old size to find how many zeros we removed

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println("list = " + list);

        System.out.println("------------ 2nd way -----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println("result = " + result);

        System.out.println("------------ classify elements in the arrayList -----------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars); //We added all the chars to the list arrayList
        letters.removeIf(p -> !Character.isLetter(p)); //removed the chars that are not letters

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars); //We added all the chars to the list arrayList
        digits.removeIf(p -> !Character.isDigit(p)); //removed the chars that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars); //We added all the chars to the list arrayList
        // specialChar.removeAll(letters);
        // specialChar.removeAll(digits);
        specialChar.removeIf(p -> Character.isLetterOrDigit(p));

        System.out.println("specialChar = " + specialChar);

    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */