package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        int a = 5;
        byte b = (byte) a;

        System.out.println(a + " : " + b);


        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);

    }
}
/*Primitives:

	double > float > long > int > short > byte

	smaller primitives can be directly assigned to larger primitive type
	larger ptimitives can NOT be directly assigned to smaller primitive types (need to be casted manually)*/