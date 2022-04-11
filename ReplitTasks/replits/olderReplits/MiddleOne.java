package replits.olderReplits;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int ch = word.length();

        if (ch==1 || ch%2==1){
            if (ch==1){
                for (int i = 0; i < 3; i++) {
                    System.out.print(word.charAt(0));
                }
            }  else {
                System.out.println(Character.toString(word.charAt(ch/2)));
            }
        } else if (ch%2==0){
            if (ch==2){
                for (int i = 0; i < 2; i++) {
                    System.out.print(word);
                }
            } else {
                System.out.println((Character.toString(word.charAt(ch/2-1)))+(Character.toString(word.charAt(ch/2))));
            }
        }







    }
}
/*3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v

Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq

When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^

2 characters, print those 2 characters twice
      @@ ==>@@@@
      @@ ==>@@@@
      $$ ==>$$$$
      $$ ==>$$$$
      hi ==> hihi*/