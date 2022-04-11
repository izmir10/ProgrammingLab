package week09;

public class R08_AB_Balanced {
    public static void main(String[] args) {

        String str = "abcabab";

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                countA++;
            }
            if (str.charAt(i) == 'b'){
                countB++;
            }
        }

        if (str.indexOf('a')<str.indexOf('b')){
            if (countA == countB){
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        } else{
            System.err.println("not balanced");
        }






    }
}

 /*      A B Balanced
       	 * * Write a program that will accept a String and check if the a's and b's in the String are
       	 * balanced. A String is balanced whenever there is an 'a' character and somewhere later
       	 * in the String there is a 'b' character
       	Ex:
       		Input: "abcab"
       		Output: "balanced"

       		Input: "bacdf"
       		Output: "not balanced"

       		Input: "ayeba"
       		Output: "not balanced"
*/