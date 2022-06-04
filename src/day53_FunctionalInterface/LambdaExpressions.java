package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");
        System.out.println("result = " + result);


        MyThirdFunctionalInterface<Integer> cubeOfAnInteger =
                (n) -> {
                    return n*n*n;
                };

        int cube = cubeOfAnInteger.method(5);
        System.out.println("cube = " + cube);

    }
}
