package week07;

import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        System.out.println(source.length());
        String password = "";

        Random random = new Random(); // I created a random abject, so I can generate random numbers

        for (int i = 1; i <= 8 ; i++) {
            int index =random.nextInt(71); //randomly up to 71 (between 0~70)
            System.out.println("index = " + index);

            password+=source.charAt(index);

        }
        System.out.println("Password: " + password);
    }
}
