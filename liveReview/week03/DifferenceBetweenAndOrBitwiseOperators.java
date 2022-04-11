package week03;

public class DifferenceBetweenAndOrBitwiseOperators {
    public static void main(String[] args) {

        int i1=5;
        int i2=10;

        System.out.println(true | false); //true
        System.out.println(true || false); // true again, but does not check the second part

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1); // 5

        System.out.println(i2>i1 | ++i1>i2);
        System.out.println("New i1 will be = " + i1); //6


        System.out.println("------------------------------");
        
        boolean a= i1<i2 && i2<++i1;
        System.out.println("a = " + a);
        System.out.println("i1 = " + i1);
        


    }
}
