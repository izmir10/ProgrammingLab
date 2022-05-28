package replits.R00_01_Basics_Variables;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {

        int[] array = {1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7};

        int[] result = new int[array.length];
        int j = 0;
        int k = array.length - 1;

        for (int i : array) {
            if (i != 0) {
                result[j++] = i;
            } else {
                result[k--] = i;
            }
        }
        System.out.println("result = " + Arrays.toString(result));
    }
}
