package week10;

public class R02_DifferenceBetweenMaxAndMin {
    public static void main(String[] args) {

        int[] arr = {4,7,10,45,-34,0,12};
        System.out.println(difference(arr)); //45-(-34) = 79

        //I want to see even numbers of this array
        System.out.println(R01_CountOfEven.counter(arr)); //5

    }

    public static int difference(int[] array){

        int diff = 0;

        int max = Integer.MIN_VALUE; //int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }

        diff =max-min;

        return diff;
    }


}
