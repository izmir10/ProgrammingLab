package day24_CustomMethods_Return;

public class ReturnStatement2<name> {
    public static void main(String[] args) {

        nameOfMonth(10);

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        if (number<1 || number >12) {
            System.out.println("Ivalid");
            return; // exits the nameOfMonth method, remaining codes never gets executed
        }

        String name = (number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April"
                    :(number==5)? "May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                    :(number==9)? "September":(number==10)?"October":(number==11)?"November": "December";


        System.out.println("Month name : "+ name);
    }



}
