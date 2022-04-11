package replits.olderReplits;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double version = input.nextDouble();

        String stringVersion=Double.toString(version);


            switch (stringVersion){
                case "1.5":
                    System.out.println("Cupcake");
                    break;
                case "1.6":
                    System.out.println("Donut");
                    break;
                case "2.1":
                    System.out.println("Eclair");
                    break;
                case "2.2":
                    System.out.println("Froyo");
                    break;
                case "2.3":
                    System.out.println("Gingerbread");
                    break;
                case "3.1":
                    System.out.println("Honeycomb");
                    break;
                case "4.0":
                    System.out.println("Ice Cream Sandwich");
                    break;
                case "4.1":
                    System.out.println("Jelly Bean");
                    break;
                case "4.4":
                    System.out.println("KitKat");
                    break;
                case "5.0":
                    System.out.println("Lollipop");
                    break;
                case "8.0":
                    System.out.println("Oreo");
                    break;
                case "9.0":
                    System.out.println("Pie");
                    break;
                default:
                    System.out.println("Sorry, I don't know this version!");
                    break;

            }




//        > `Versions`
//        > 1.5 - Cupcake
//        > 1.6 - Donut
//        > 2.1 - Eclair
//        > 2.2 - Froyo
//        > 2.3 - Gingerbread
//        > 3.1 - Honeycomb
//        > 4.0 - Ice Cream Sandwich
//        > 4.1 - Jelly Bean
//        > 4.4 - KitKat
//        > 5.0 - Lollipop
//        > 8.0 - Oreo
//        > 9.0 - Pie
    }
}
