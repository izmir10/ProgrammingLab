package week15.checkedExceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        // Thread.sleep(5000);  // throws or causes InterruptedException ==> checked exception
        // 1. first way to handle is try & catch

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("I will move on with my web automation");

        // 2. Second way is to declare Throws keyword

        Thread.sleep(5000);
        System.out.println("More automation after 5 more seconds");



    }
}
