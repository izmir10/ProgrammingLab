package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabccc";
                   // 0123456
        String result = "";

        for (int i = 0; i < str.length(); i++) {            //i: index numbers of the str (starting from 0)

            char ch = str.charAt(i);                        // ch: each character of the str

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {   // if the first and the last index number of the character are same,
                result += ch;                               // then the character is unique
            }
        }

        System.out.println("result = " + result);


    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */