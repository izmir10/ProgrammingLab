package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; //frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked
                char each = str.charAt(i); //each character of the str
                if (ch == each) {
                    count++;
                }
            }

           /* if (count == 1) { //if the frequency of the character is 1, then the character is unique
                result += ch;
            } */

            if (count != 1) {
                continue;
            }
        }

        System.out.println("result = " + result);
    }
}
// Write a program that can find unique characters from a string
// without using indexOf() and lastIndexOf() methods