package week15;

public class MultiCatchExamples {
    public static void main(String[] args) {

        //more specialized exception class statement should be first in thr order

        String word = "Java"; // length is 4

        try {
            System.out.println(word.substring(20));  // unchecked exception / StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason: " + e.getMessage());
        } catch (Throwable e){                      // Throwable is parent of all exceptions
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason: " + e.getMessage());
        }




    }
}
