package replits.olderReplits;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String answer=scan.next();
        while(!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Invalid entry. Please enter yes/no: ");
            answer=scan.next().toLowerCase();
        }
        if(answer.equals("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            scan.nextLine();
            String roomType=scan.nextLine().toLowerCase();
            while(!(roomType.equals("king bed")||roomType.equals("queen bed")||roomType.equals("single bed")   )){
                System.out.println("Invalid room type. Please enter King Bed, Queen Bed or Single Bed ");
                roomType=scan.nextLine().toLowerCase();
            }
            if(roomType.equals("king bed")) {
                System.out.println("King bed is $120");
            }else if(roomType.equals("queen bed")){
                System.out.println("Queen bed is $100");
            }else{
                System.out.println("Single bed is $80");
            }

        }else{
            System.out.println("Have a nice day!");
        }

        scan.close();

/*

            while ( ! (answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry, please re-enter");
                answer = scan.next();
                break;
            }

            if (answer.equals("no")){
                System.out.println("Have a nice day");
                break;
            }

            if (answer.equals("yes")){
                System.out.println("Please select the bed size:");
                String bedSize = scan.nextLine().toLowerCase();



                break;
            }

        }

*/



/*

        if (answer.equals("no")) {
            System.out.println("Have a nice day");
        } else if (!(answer.equals("yes") || answer.equals("no"))) {
            while (true) {
                System.err.println("Invalid answer! Please re-enter \"yes\" or \"no\" ");
                answer = scan.next().toLowerCase();
            }
        } else {
            System.out.println("YESSSS");
        }




        System.out.println("Please select the bed size: ");
        String bedSize = scan.next().toLowerCase();
*/


/*        if (answer.equals("no")) {
            System.out.println("Have a nice day");
        }*/
/*        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer! Please re-enter \"yes\" or \"no\" ");
            answer = scan.next().toLowerCase();
        }*/

/*        if (answer.equals("yes")) {
            System.out.println("Please select the bed size: ");
            String bedSize = scan.nextLine().toLowerCase();

            if ((bedSize.equals("king bed") || bedSize.equals("queen bed") || bedSize.equals("single bed"))) {
                if (bedSize.equals("king bed")) {
                    System.out.println("King Bed: $120");
                } else if (bedSize.equals("queen bed")) {
                    System.out.println("Queen Bed: $100)");
                } else {
                    System.out.println("Single Bed: $80");
                }
            }
            while (!((bedSize.equals("king bed") || bedSize.equals("queen bed") || bedSize.equals("single bed")))) {
                System.err.println("Invalid entry! Please enter a valid bed size:");
                bedSize = scan.nextLine();
            }

        } else {
            System.out.println("Have a nice day");
        }
*/

    }
}

/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to
reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */