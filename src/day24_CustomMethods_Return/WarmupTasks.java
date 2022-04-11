package day24_CustomMethods_Return;

public class WarmupTasks {
    public static void main(String[] args) {

        initials("wooden", "spoon"); //W.S

        System.out.println("---------------DomainName------------------------");

        domain("dogcoin.mail@gmail.com");

        System.out.println("----------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------NameOfTheMonth-------------------------");
        nameOfMonth(12);

        System.out.println("---------------NameOfTheDay--------------------------");
        nameOfDay(4);



    }

    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain.toUpperCase());

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        /*    switch (number){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.err.println("Invalid Entry");



        }*/

        String name = "";

        if (number >=1 && number <=12){
            name = (number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April"
                    :(number==5)? "May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                    :(number==9)? "September":(number==10)?"October":(number==11)?"November": "December";
        } else{
            System.out.println("Invalid entry");
        }
        System.out.println("Month name : "+ name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.err.println("Invalid Entry");
        }
    }


}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */