package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];
/*

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){ //if there is element in the array greater than the current max, we replace it
                max = numbers[i];
            }
        }
*/

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max = " + max);

        System.out.println("-------------------------------------------");

        int min = numbers[0];

        for (int number2 : numbers) {
            if (number2 < min){
                min = number2;
            }
        }
        System.out.println("min = " + min);


    }
}
