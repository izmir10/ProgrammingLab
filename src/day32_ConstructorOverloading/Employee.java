package day32_ConstructorOverloading;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //this.name = name; ==> instead of rewriting we called from the previous constructor
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double Salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}

    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself
 */