package day14_StringClass;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "           batch     EU   8    ";
        str1 = str1.trim();
        System.out.println("str1 = " + str1);

        System.out.println("---------------------------");
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h"); //8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g ");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("a");
        System.out.println("n5 = " + n5);


    }
}
