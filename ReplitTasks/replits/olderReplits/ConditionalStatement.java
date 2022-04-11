package replits.olderReplits;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();


        if (name.equals("Chen")){
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }

    }

}
