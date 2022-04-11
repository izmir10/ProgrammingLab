package week02;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
         * name
         * companyName
         * jobTitle
         * gender --- char F/M
         * salary --- double
         * employeeID --- int
         * hasBenefits(Y/N) --- boolean true/false
         * isMarried --- char Y/N
         * */

        String name, companyName, jobTitle;
        name = "Selim Ileri";
        companyName = "Apple Inc.";
        jobTitle = "Senior SDET";
        char gender = 'M';
        double salary = 470_000;
        int employeeID = 21566;
        boolean hasBenefits = true;
        char isMarried = 'Y';

        System.out.println("\nName: " + name + "\nCompany Name: " + companyName + "\nJob Title: " + jobTitle +
                "\nGender: " + gender + "\nSalary: " + salary + "\nEmployee ID: " + employeeID +
                "\nHas Benefits?: " + hasBenefits + "\nIs Married? " + isMarried);


    }

}
