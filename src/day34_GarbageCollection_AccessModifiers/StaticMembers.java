package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    public static int num = 100; // 1. variables can be static

    public static void method(){  // 2. methods can be static

    }

    static{ // 3. blocks can be static

    }

}

// 4. also classes can be static. (but it must be a nested class and only the inner class can be static)
// outer class can NOT be static

class A { // outer class ~ can not be static

    static class B { // inner class can be static

        public static void method1(){

        }

    }
}

class C {
    public static void main(String[] args) {

        A.B.method1();

    }
}
