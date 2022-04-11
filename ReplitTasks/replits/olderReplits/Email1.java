package replits.olderReplits;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String first = "";
        String last = "";
        String domain = "";

        if (email.contains("_")) {
            first = email.substring(0, email.indexOf('_'));
            last = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
            domain = email.substring(email.indexOf('@'));

            System.out.println(last + "_" + first + domain);

        } else {
            System.out.println(email);
        }


    }
}
/*
* Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
* */