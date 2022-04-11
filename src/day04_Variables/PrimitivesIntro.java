package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;
        System.out.println(age);

        // weight: 160 pounds
        short weight = 160; //160 is within the range of short
        System.out.println(weight);

        // salary: $ 100000
        int salary = 100_000; // 100000 is within the range of int
        System.out.println(salary);

        // the reason that we use the appropriate number is to reduce the memory usage.
        // byte uses 1 byte of memory, whereas short uses x2 (2 bytes), int uses x4 (4 bytes) of memory.
        // int is preferred data type for integers

        long asset = 3_333_333_333L;
        // don't forget to add lover case or upper case L just after the number
        System.out.println(asset);

        System.out.println("-----------------------------------------------------------------");

        //If you have decimal numbers you need to use float or double

        float tax = 0.26F;
        //Double is the default for decimals.
        // That's why we need to add F (or f) right after the decimal if we use float

        // double is greater than the other numerical primitive types
        // double > float > long > int > short > byte

        System.out.println("---------------------------------------------------------------------");

        // char = #

        char ch1 = '#';

        char ch2 = 35;

        char ch3 = 243;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        System.out.println("\n");
        char gender = 'F';
        char grade = 'A';
        char yesNo = 'Y';
        char direction = 'S';
        boolean result = 100>300;


        System.out.println("result = " + result);

        System.out.println("--------------------------------------------------");

        String name = "Wooden Spoon"; // S is always upper-case on String
        String city = "Denton"; //String is used for multiple characters / string of text
        String state = "Texas";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);


        System.out.println("-----------------------------");

        int a= 100;
        double b = a;

        System.out.println(a);
        System.out.println(b);

        double x = 20.6;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);



    }
}
