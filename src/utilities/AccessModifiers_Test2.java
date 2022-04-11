package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.defaultData); // ==> default Access Modifier Not visible from a different package
        // System.out.println(AccessModifiers.privateData); // ==> private Access Modifier Not visible from a different class

        AccessModifiers.method1();
        // AccessModifiers.method2(); // method with default access modifier is not visible from a different package
        // AccessModifiers.method3(); // method with private access modifier is not visible from a different class


    }
}
