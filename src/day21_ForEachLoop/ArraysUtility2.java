package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        System.out.println("------------------ copyOf() ------------------------------");
        //starts copying from the first element till the given index number 

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println("Early Birds = " + Arrays.toString(earlyBirds)); //[Elif, Sinem, Gunay]
        
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        numbers = Arrays.copyOf(numbers, 5); // We assigned new variable
        
        System.out.println("Numbers = " + Arrays.toString(numbers));//1,2,3,4,5
        

        System.out.println("------------------ copyOfRange() ------------------------------");
        
        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6); //[C, D, E, F], Ending index 'G' excluded

        System.out.println(Arrays.toString(ch2));

        char[] ch3 = Arrays.copyOfRange(ch1, 2, 6+1);// Ending index 'G' excluded, so we need to add +1
        System.out.println(Arrays.toString(ch3)); //[C, D, E, F, G]

        System.out.println("-------------------------------------------------");
        
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        int[] result = Arrays.copyOfRange(scores, 3, 8); //[40, 50, 60, 70, 80]
        System.out.println("Result = " + Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length);
        System.out.println("Result2 = " + Arrays.toString(result2));

    }
}
