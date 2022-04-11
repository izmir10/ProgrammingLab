package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "   ";

        boolean r = str.isEmpty();
        System.out.println("r = " + r);

        boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);

        System.out.println("------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equalsIgnoreCase("yes"));

        System.out.println("-----------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");


        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("--------------------------------");
        
        String a = "Wooden Spoon";
        boolean x = a.toLowerCase().startsWith("woo");
        boolean y = a.toLowerCase().endsWith("spoon");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
