package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData); //==> I can NOT access private access modifier outside its class

        AccessModifiers.method1();
        AccessModifiers.method2();
        // AccessModifiers.method3(); // method with private access modifier is not visible from a different class

    }

}
