package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        } catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch Block");
    //        System.exit(0);               // Only way to stop execution of finally block, we must explicitly stop the system
        } finally {
            System.out.println("Finally Block");  // Finally block always get executed, regardless of the exception handled or not handled
        }

    }
}
