package day30_CustomClassIntro;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("John",25,2237, 'M', "Developer", 100000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Anna",28, 2287, 'F', "QA", 85000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("David",35, 2256, 'M', "QA", 45000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Lina",45, 2290, 'F', "Manager", 80000, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Kevin", 35, 2298, 'M', "Senior QA", 110000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        String fullTimers = "";
        String partTimers = "";

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
                fullTimers+= employee.name + ", " + employee.jobTitle + " \n";
            } else{
                countPartTime++;
                partTimers+= employee.name + ", " + employee.jobTitle + " \n";
            }
        }
        System.out.println("Number of full time employees: " + countFullTime);
        System.out.println("fullTimers = \n" + fullTimers);

        System.out.println("Number of full time employees: " + countPartTime);
        System.out.println("partTimers = \n" + partTimers);

        System.out.println("------------------------------------");

        double max = employees[0].salary;
        String name = "";

        for (Employee employee : employees) {
            if (employee.salary > max){
                max = employee.salary;
                name = employee.name;
            }
        }
        System.out.println("Maximum Salary: " + name +  ", $" + max);

        double min = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary < min){
                min = employee.salary;
                name = employee.name;
            }
        }
        System.out.println("Minimum Salary: " + name +  ", $" + min);



    }
}
