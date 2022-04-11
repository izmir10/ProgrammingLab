package replits.olderReplits;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //Write your code here:
        int cardTotal = house + player;

        if (cardTotal < 21) {
            if (player > house) {
                System.out.println("player win");
            } else if (house > player){
                System.out.println("player loss");
            } else {
                System.out.println("its a tie");
            }
        } else {
            System.out.println("player bust");
        }




    }
}
