package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("----------------------------------------");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Wooden Spoon ");
            }
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");



    }


}

