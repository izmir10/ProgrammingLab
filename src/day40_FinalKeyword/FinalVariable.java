package day40_FinalKeyword;

public class FinalVariable {

    final char gender;  //(instance variables)
    final String birthDay;

    public FinalVariable(char gender, String birthDay) { //we must create constructor for instance variables to create objects
        this.gender = gender;
        this.birthDay = birthDay;
    }


    final static String name;
    static {
        name = "Batch EU8";
    }


    public final static void main(String[] args) {

        final double pi = 3.14; //(local variables)

        // pi = 3; final variables are unchangeable and can not be reassigned
        // pi = 4.14;


        final String name;
        name = "Java";
        // name = "WoodenSpoon";
        System.out.println(name);


        System.out.println("-------------------------------------");

        FinalVariable obj = new FinalVariable('M', "4th of July");
        // obj.birthDay = "June/01"; // I can not reassign after I initialized first time.

        System.out.println(obj.birthDay);

        System.out.println("----------------------------------------");

        // FinalVariable.name = "Python";  // I can not change because it is final (not because it is static)

        System.out.println(FinalVariable.name);




    }


}
