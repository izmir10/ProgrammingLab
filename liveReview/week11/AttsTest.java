package week11;

public class AttsTest {
    public static void main(String[] args) {

        Atts atts = new Atts();

        atts.name = "cookie"; //instance variables
        atts.color = "brown";
        atts.amount = 10;

        System.out.println("atts.asString() = " + atts.asString());



    }
}
