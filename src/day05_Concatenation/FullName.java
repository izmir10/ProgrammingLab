package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        // Full name of the person is _________
        // ______ is __ years old.

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName + ". ");

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + "," + " works at " + companyName
                + ", and " + fullName + "'s salary is $" + salary);


    }
}
