package replits.R00_01_Basics_Variables;

public class ListNumbersWithForLoop {
    public static void main(String[] args) {


        String result = "";

        for (int i = 1; i < 6; i++) {
            String ch = i + ", ";
            result += ch;
        }
        System.out.println(result.substring(0, result.length() - 2));

        /*
                 for (int i = 1; i < 6; i++) {
            if (i!=5) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        */

/*
        int n = 5;
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i + ",";
        }

        System.out.println(result.replace(n + ",",n + ""));
*/

    }
}
