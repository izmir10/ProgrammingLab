package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = ""; // abc

        for (int i = 0; i < str.length(); i++) { //i: represents all the index numbers of str (starting from 0)
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)){ //if the ch is not contained in the result,
                result += ch; // the ch will be added to the result
            }

        }

        System.out.println("result = " + result);

    }
}
