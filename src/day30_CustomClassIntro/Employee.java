package day30_CustomClassIntro;

public class Employee {

    public String name;
    public int age;
    public int id;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int age, int id, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }

    public void vacation(){
        System.out.println(name + " is in vacation");
    }

    public void sickLeave(){
        System.out.println(name + " is on sick leave");
    }


}
