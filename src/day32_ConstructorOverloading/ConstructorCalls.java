package day32_ConstructorOverloading;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(9); ==> gives compile error, because it basically calls itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //this(); ==> gives compile error, because it must be the first statement
    }

    public ConstructorCalls(String str){
        this(10);
        //this(9); ==> gives compile error, because it is not the first statement and one constructor can call only one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("----------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println(obj2);

        System.out.println("----------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

    }


}
