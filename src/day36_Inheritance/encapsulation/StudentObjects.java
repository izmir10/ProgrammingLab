package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Selim", 43, 'M', 'A', "Cydeo");

        System.out.println(student1);
        student1.study();

        student1.setName("Tahsin");
        System.out.println(student1);
        student1.study();
        System.out.println(student1.getName());



    }
}
