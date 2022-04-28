package day43_Abstraction.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Gillian", 23, 'F', 123, "SDET", 95000);
        Tester tester2 = new Tester("Simon", 32, 'M', 233, "QA", 105000);

        tester1.sleep();
        tester1.setName("Marry");
        tester2.work();
        System.out.println(tester1);

        Developer developer = new Developer("Carl", 42, 'M', 232, "Senior Developer", 140000);
        System.out.println(developer);
        developer.work();
        developer.sleep();

        Driver driver = new Driver("Leila", 27, 'F', 198, "Limo Driver", 90000);
        driver.setName("Lilly");
        driver.sleep();
        driver.work();





    }
}
