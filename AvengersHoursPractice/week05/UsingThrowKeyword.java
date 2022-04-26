package week05;

public class UsingThrowKeyword {
    public static void main(String[] args) {

        /*
        we use the throw keyword to create an exception
         */

        String username = "";

        if (username.isEmpty()){
            throw new RuntimeException("Username can NOT be empty");
        }


    }
}
