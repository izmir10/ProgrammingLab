package week10;

public class R03_CalculateRetirement {
    public static void main(String[] args) {

        yearsUntilRetirement("Selim", 1979); //Selim retires in 22 years

        //we called a method from another method

    }


    //calculate age of a person
    public static int calculateAge(int yearOfBirth){

        return 2022-yearOfBirth;
    }

    //assume that retirement age is 65
    public static void yearsUntilRetirement(String name, int yearOfBirth){

        int yearsUntilRetirement = 65 - calculateAge(yearOfBirth);
        System.out.println(name + " retires in " + yearsUntilRetirement + " years");
    }


}
