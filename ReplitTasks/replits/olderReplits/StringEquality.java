package replits.olderReplits;

public class StringEquality {
    public static void main(String[] args) {

        String s1 = "I love";
        s1 += " Java";

        String s2 = "I";
        s2 += " love Java";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


        if (s1.equals(s2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }




    }
}
