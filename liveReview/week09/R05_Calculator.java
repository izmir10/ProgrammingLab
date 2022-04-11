package week09;

public class R05_Calculator {
    public static void main(String[] args) {

        System.out.println(add(5.2, 20.5)); //25.7

        double sum = add(4,5); //9.0
        System.out.println(sum);

        int sum2 = (int) add(4,5); // add returns double, so we need to cast explicitly to int (int)
        System.out.println(sum2); // 9

        System.out.println("100 * 200 : " + multiplication(100, 200)); //20000.0



    }

    public static double add(double num1, double num2) { //num1 and num2 are called pass by variables, can be same name but doesn't affect other
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }



}