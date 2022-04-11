package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihan", 'M', 25);

        Student student6 = new Student("Nurhan", 'F', 41, 15);

        Student student7 = new Student("Selim",'M', 42, 623, 'A');

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));


    }

}
