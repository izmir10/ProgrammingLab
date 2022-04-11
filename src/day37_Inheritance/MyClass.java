package day37_Inheritance;

public class MyClass {

    public static int y = 45; //static variable
    public int x = 75; //instance variable

    //static method
    public static void staticMethod(){
        System.out.println("static method is called from instance block");
    }

    //instance method
    public void instanceMethod(){
        System.out.println("instance method is called from instance block");
    }

    //constructor
    MyClass(){
        System.out.println("constructor is executed");
    }

    //instance block
    {
        System.out.println(x);
        System.out.println(x = 10);
        System.out.println(y);
        staticMethod();
        instanceMethod();
        System.out.println("instance block is executed");
    }

    //static block
    static{
        System.out.println( y );
        System.out.println( y = 20 );
        System.out.println("static block is executed");
    }


}

class Test{
    public static void main(String[] args) {
        MyClass object1 = new MyClass();
    }
}