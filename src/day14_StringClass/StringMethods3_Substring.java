package day14_StringClass;

public class StringMethods3_Substring {
    public static void main(String[] args) {


        String word = "Cydeo School";
        //      0123456789...
        String brand = word.substring(0, 4+1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        System.out.println("------------------------------------");
        String word2 = "Java Programming Language";
        //String word2 = "Pyhthon C# Ruby";

        String s1 = word2.substring(0, word2.indexOf(" ")); //"Java"
        System.out.println("s1 = " + s1); //Java

        //String s2 = word2.substring(word2.indexOf("P"), word2.lastIndexOf(" "));//"Programming"
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2); //Programming

        String s3 = word2.substring(word2.lastIndexOf(" ")+1); //"Language"
        //String s3 = word2.substring(word2.indexOf("L"));
        System.out.println("s3 = " + s3); // Language






    }
}
