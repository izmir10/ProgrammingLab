package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        // System.out.println(ProtectedAccessModifier.name1); // Still I can not call because it has a default access modifier
        System.out.println(ProtectedAccessModifier.name2); // Yey! I can call default access modifier now! There is inheritance relationship! Look at above :) (extends..)

        // AccessModifiers_Test4.method1(); // I can not call, because method1()@s access modifier is default
        // ProtectedAccessModifier.method1();

        AccessModifiers_Test4.method2();
        ProtectedAccessModifier.method2();


    }



}
