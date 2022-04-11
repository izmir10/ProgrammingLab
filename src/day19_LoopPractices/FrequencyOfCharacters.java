package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result ="";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency =0;

            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    frequency++;
                }
            }
            if(result.contains(""+ch)){ //I check the character at the result. If it is inside,
                continue;               // I skip that character with (continue;)
            }

            result+=ch;
            result+=frequency;

        }
        System.out.println(result);

/*

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println("result = " + result);

*/


    }
}
//Write a program that can return the frequency of a character from a String
//ex: str = "aabcccd";
//output: a2b1c3d1