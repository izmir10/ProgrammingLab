package day43_Abstraction.employeeTask;

import java.util.InputMismatchException;

public abstract class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if ( !(gender =='M' || gender == 'F') ){
            throw new InputMismatchException ("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>150){
            throw new RuntimeException("Invalid age! : " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void eat(){
        System.out.println(name + " is eating baklava");
    };

    public abstract void sleep();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
