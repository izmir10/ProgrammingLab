package week09;


public class R06_CalculatorTest {
    public static void main(String[] args) {

        //I need to use the calculator that I created in previous Class

        // CALL methods of other Classes


        System.out.println(R05_Calculator.add(5.2, 4.3));
        //When we create custom methods, 3 possible ways of using are:
        //1. If it is inside the same Class ==> no need to write the Class name
        //2. If it is inside another Class ==> we want to call our method, both classes are in the same package
        //   Write ClassName.methodName : Calculator.add()
        //3. Different class and different package ==> import the class first: import week09.Calculator
        //   Then write ClassName.methodName   : Calculator.add()


    }
}
