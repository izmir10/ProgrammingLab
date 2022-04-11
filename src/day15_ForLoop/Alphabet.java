package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        // A to Z -----> A=65, Z=90

        for (int i= 65; i<=90; i++){ // used integer first and assigned that int number to (char)
            System.out.print((char) i+" ");
        }
        System.out.println();

        for (char i= 'A'; i<= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for (char i= 65; i<=90; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (char i= 90; i>=65; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for (char i= 97; i<=122; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i= 122; i>=97; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------");
        for (char i= 'A'; i<= 'Z'; i++){
            System.out.print(i+" ");
        }
      //  System.out.println();
        for (char i= 'z'; i>= 'a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------");
        for (char i= 1; i<= 400; i++){
            System.out.print(i+" ");
        }



    }
}
