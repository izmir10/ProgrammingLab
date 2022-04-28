package day43_Abstraction.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Gillian", 23, 'F', 123, "SDET", 95000);
        Tester tester2 = new Tester("Simon", 32, 'M', 233, "QA", 105000);

        tester1.sleep();
        tester1.setName("Marry");
        tester2.work();
        tester2.bugReport();
        System.out.println(tester1);

        Developer developer = new Developer("Carl", 42, 'M', 232, "Senior Developer", 140000);
        System.out.println(developer);
        developer.work();
        developer.sleep();
        developer.unitTest();

        Driver driver = new Driver("Leila", 27, 'F', 198, "Limo Driver", 90000);
        driver.setName("Lilly");
        driver.sleep();
        driver.work();

        Teacher teacher = new Teacher("Drake", 59, 'M', 13, "Literature Teacher",120000);
        teacher.work();
        teacher.sleep();
        teacher.eat();
        System.out.println(teacher);


        System.out.println("----------------------------------------");

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer2 = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher2 = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver2 = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer2);
        System.out.println(teacher2);
        System.out.println(driver2);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer2.work();
        developer2.sleep();
        // developer.bugReport();
        developer2.eat();
        developer2.unitTest();

        System.out.println("-----------------------------------");

        teacher2.work();
        teacher2.sleep();
        teacher2.eat();

    }
}
