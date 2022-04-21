package day42_ExceptionsContinue;

class FadyException extends RuntimeException{  // custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){  // custom checked exception
        super(message);
    }

}

class NoBreakException extends Exception{

}

public class CustomException{

    public static void main(String[] args) {

     //  throw new FadyException();
     //   throw new FadyException("It's time to print");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }
}
