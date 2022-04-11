package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Selim", 'M', 43, 120000);

/*
        employee1.setName("Selim");
        employee1.setGender('M');
        employee1.setAge(43);
        employee1.setSalary(120000);
*/

        employee1.setAge(28);

        System.out.println(employee1);
        System.out.println(employee1.getName() + " : " + employee1.getSalary());

        System.out.println("-----------------------------");

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);

        employee2.setSalary(employee2.getSalary() + employee1.getSalary()*0.5);

        System.out.println(employee2);


    }
}
