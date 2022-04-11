package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        //parse method converts the String to primitive
        
        String str = "123";
        System.out.println(str + 1); //1231

        int num1 = Integer.parseInt(str); //return type is int
        System.out.println(num1 + 1); //124

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2); //10.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max); //max = 2147483647
        System.out.println("min = " + min); //min = -2147483648

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2); //max2 = 9223372036854775807
        System.out.println("min2 = " + min2); //min2 = -9223372036854775808


        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1); //false


        System.out.println("------------------valueOf-----------------");
        
        // valueOf method converts the String into WrapperClass
        
        String s2 = "123";
        
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2); //Integer

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        String s3 = "1.5";
        Double z = Double.valueOf(s3); // double

        System.out.println("z = " + z);

        System.out.println("------------------Character Class---------------------");

        //isDigit() method: if the character is digit or not 0 ~ 9
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1); //true

        //isLetter()
        boolean r3 = Character.isLetter(ch1); //false

        //isLetterOrDigit
        boolean r4 = !Character.isLetterOrDigit(ch1); //is it special character?

        //isUpperCase()
        boolean r5 = Character.isUpperCase(ch1);

        //isLowerCase()
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("-----------------------------------------------------");

        String s = "ab1cde2efg3hdi4"; //find sum of all the digits

        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);










    }

}
