package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class TVTest {
    public static void main(String[] args) {

        //we will create a TV object

        TV Samsung = new TV();
        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung);

        System.out.println("----------------------------------------");
        TV LG = new TV();
        System.out.println(LG);

        LG.turnOn();
        LG.setChannel(10);
        LG.setVolume(5);
        System.out.println(LG);

        System.out.println("----------------------------------------");
        TV Sony = new TV(3, 4, false);
        System.out.println(Sony);

        System.out.println("------------------------------------------");
        //ArrayList
        ArrayList<TV> tvList = new ArrayList<>(Arrays.asList(Samsung, LG, Sony));

        for (TV eachTV : tvList) {
            System.out.println("Is the TV on? " + eachTV.on);
        }


    }
}
