package day35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Maribu", 4, 2.5, true);
        Candy candy2 = new Candy("Cadburry", 2, 3, false);
        Candy candy3 = new Candy("Snickers", 4, 1.5, true);
        Candy candy4 = new Candy("Lindth", 1, 12.5, false);
        Candy candy5 = new Candy("Reeses", 6, 3.5, true);

        Candy[] list = {candy1, candy2, candy3, candy4, candy5};

        System.out.println(Arrays.asList(list));

        for (Candy candy : list) {
            System.out.println(candy.getBrand() + " : $" + candy.getPrice());
        }

        System.out.println("----------------------------------------");

        ArrayList<Candy> noPeanuts = new ArrayList<>();
        for (Candy candy : list) {
            if (candy.getHasPeanuts() == false){
                noPeanuts.add(candy);
            }
        }

        System.out.println("Peanut-Free Candies:");
        for (Candy noPeanut : noPeanuts) {
            System.out.println(noPeanut.getBrand() + " : $" + noPeanut.getPrice());
        }



    }
}
