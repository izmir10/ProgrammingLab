package replits.R04_Loops;

public class Patterns {
    public static void main(String[] args) {

        int n = 5;

        System.out.println("\n\n-----Square-------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n------Increasing Triangle--------");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n----Right Sided Triangle------");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n---Reverse Right Sided Triangle ");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n----Reverse Hill-----");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n------Hill-------");
        for (int i = 1; i < n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n\n-------------Diamond----------------");

        for (int i = 1; i < n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

