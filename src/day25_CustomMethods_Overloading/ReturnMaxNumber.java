package day25_CustomMethods_Overloading;

public class ReturnMaxNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 75, 6, 44, 7, 8, 13};

        System.out.println(max(arr));





    }

    public static int max(int[] arr){
        int max = 0;

        for (int i : arr) {
            if (i >= max) {
                max = i;
            }
        }
        return max;

    }


}
