package replits.olderReplits;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();

        if (coupons >= 3){
            if ((coupons%10)>=0){
                System.out.println("Number of Candies: " + (coupons/10));
                System.out.println("Number of Gumballs: " + (coupons%10)/3);
            } else {
                System.out.println("Number of Candies: 0");
                System.out.println("Number of Gumballs: " +(coupons/3));

            }

        } else {
            System.out.println("Not enough coupons");
        }

        input.close();

    }
}
