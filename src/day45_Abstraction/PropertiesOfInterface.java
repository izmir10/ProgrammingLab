package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default  // int a;
    static int b = 200; // static int b;

/*
    public PropertiesOfInterface(int a){
        this.a = a;
    }
*/

/*
    static {
        b = 100;
    }
*/

/*
    public void method1(){
        System.out.println("Instance Method");
    }
*/

    public static void method2(){
        System.out.println("Static Method");
    }

    public abstract void method3();

    public default void method4(){
        System.out.println("Default Method");
    }


}
