package day36_Inheritance.employeeTask;

public class BusinessIndustry {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Josh", 'M', 27, "Junior SDET", 275, 120000, "Microsoft");

        tester.work();
        tester.test();

        System.out.println(tester);

        System.out.println("-----------------------------------");

        Developer developer = new Developer();
        developer.setInfo("Markus", 'M', 42, "Scrum Master", 125, 180000, "Amazon");

        developer.work();
        developer.develop();

        System.out.println(developer);




    }
}
