package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static{
        // We need a main method (for versions after Java8) in order to execute static method
        // However, even if the main method exists up, the static block is executed FIRST
        // Each static block runs before anything and runs only one time
        // It can not be called. It only gets executed
        // It is mainly used for initializing static variables


        System.out.println("Static Block 1");

    }

    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }


}
