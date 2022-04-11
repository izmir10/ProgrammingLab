package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

    String[] str = {"Jose", "Saramago", "Book", "Blindness"};

    String[] reversedStr = reverse(str);
        System.out.println(Arrays.toString(reversedStr));

    }
public static String[] reverse(String[] str){
    String[] reversed = new String[str.length];
    int temp = 0;

    for (int i = str.length - 1; i >= 0; i--) {
        reversed[temp++] = str[i];
    }
    return reversed;
}

}
