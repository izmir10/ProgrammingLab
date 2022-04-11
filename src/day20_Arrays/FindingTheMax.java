package day20_Arrays;

public class FindingTheMax {
    public static void main(String[] args) {

        int [] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];  // we assume that first number is the greatest and start to compare with other numbers

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){  //if there is element in the array greater than the current max, we replace it
                max = numbers[i];
            }
        }

        System.out.println(max);


    }
}
