package week05;

import java.util.Locale;

public class StringReview02 {
    public static void main(String[] args) {

        /*
        length(); it returns an int number
        replace()
        toUpperCase
        toLowerCase
        substring()
        charAt()
        indexOf()
        lastIndexOf
        equals()
        trim()
         */
        System.out.println("--------- LENGTH ---------");
        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("How many characters we have: " + count);
        System.out.println(count == 16); // true

        if (message.length()==16){
            System.out.println("happy testing");
        }
        System.out.println("--------- UPPER CASE ----------");

        System.out.println("message before uppercase:");
        System.out.println("message = " + message);

        message = message.toUpperCase(); // assigned to upperCase
        System.out.println("message after uppercase");
        System.out.println("message = " + message);

        System.out.println("------------- TRIM ---------------");
        String str = "     abc    ";
        System.out.println("str = " + str);
        String strTrimmed = str.trim();
        System.out.println("strTrimmed = " + strTrimmed);

        System.out.println("--------------- REPLACE ------------------");
        String str3 = "    abc    cde    ";
        System.out.println("str3 = " + str3);
        str3 = str3.replaceAll("    ", "");
        System.out.println("str3 = " + str3);

        String str4 = "  EU8 Awesome ";
        System.out.println("str4= " + str4);
        str4= str4.trim().replaceFirst(" ", "");
        System.out.println("str4 = " + str4);

        System.out.println("-----------------------------");
        String str5 = "  EU8 Awesome ";
        str5 = str5.trim().replaceFirst(" ", "").toUpperCase(Locale.ROOT).substring(3);
        System.out.println("str5 = " + str5);



    }
}
