package day42_ExceptionsContinue;

public class DisadvantageOfThrowsKeyword {

    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep( (long) (seconds * 1000) );

    }

    public static void main(String[] args) {

        System.out.println("Hello");

  //      sleep(2.5); // throws keyword

        System.out.println("Hello World");

        System.out.println("-------------------------------------");

        System.out.println("Hello");

        MorningWorkout.sleep(2.5); // try & catch blocks

        System.out.println("Cydeo");




    }



}
