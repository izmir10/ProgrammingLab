package replits.olderReplits;

public class AllThingsConsidered {

    //01. main method
    public static void main(String[] args) {

    //02. print() & println()
    System.out.print("same line");
    System.out.println("new line");

    //03.Escape sequences

    //04. Concatenation

    //05. Primitives & String variables

    //06. Castings (explicit)

        int a = 3,  b = 2;

        long c = (a+b) * 2 / 3 % 2 ;

        System.out.println(c);

        long a1= 3_000L;
        double b1 = (float)a1;
        int c1 = (short)b1;

        System.out.println(c1 % 1000);

        System.out.println("-------------------------------------------");

        boolean x=true, z = true;
        int y= 20;
        x=(y!=10) || (z=false);
        System.out.println(x);



    }

}
