package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names

        // String myGroup []; //we can put the brackets before string name or after it
        String [] Group = new String[5];

        // System.out.println(myGroup); //hashcode error, wrong
        System.out.println(Arrays.toString(Group)); //output is [null, null, null, null, null]
                                                      //for non-primitives default value is ==> [null]
                                                      //for primitives byte, short, int, long ==> [0]
                                                      //               float, double ==> [0.0]
                                                      //               boolean ==> [false]

        int [] Group2 = new int[5];
        System.out.println(Arrays.toString(Group2)); //output is [0, 0, 0, 0, 0]

        System.out.println("-----------------------------------------------------");

        String [] myGroup = new String[5];  // ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------------------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                       //   0           1           2           3           4          5          6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }
}
