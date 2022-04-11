package day04_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        Create a class named EmployeeInfo. Declare following info:
        1. name (String)
        2. age (int)
        3. gender (char)
        4. company (String)
        5. jobTitle (String)
        6. yearsOfExperience (double)
        7. salary (int)
        8. isFullTime (boolean)
        9. isMarried (boolean)
        10. employeeId (String)
        11. SSN (String)
        */

        String name = "Selim Ileri";
        int age = 42;
        char gender = 'M';
        String company = "UT Dallas";
        String jobTitle = "Teaching Assistant";
        double yearsOfExperience = 7.5;
        int salary = 72000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "C654236";
        String SSN = "987678 6363 888";


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = $" + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);



    }


}
