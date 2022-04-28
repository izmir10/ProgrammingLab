package day43_Abstraction.employeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ ", " + getJobTitle()+ " is developing application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " will sleep after writing codes");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
