package week09;

public class R07_CombineStrings {
    public static void main(String[] args) {
/*
Write a method/function that will take two String and combine them
Ex:
        Input: "java", "apple"
        Output: "jaapvpale"

        // jaapvpale
*/

        System.out.println(combineStrings("abc", "defg")); //adbecfg

        String str = combineStrings("java", "fun");
        System.out.println("str = " + str);


    }

    public static String combineStrings(String str1, String str2) {

        String combined = "";

        int biggestSize = str1.length() >= str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < biggestSize; i++) {
            if (i < str1.length()) {
                combined += str1.charAt(i);
            }
            if (i < str2.length()){
                combined += str2.charAt(i);
            }
        }

        return combined;
    }

}
