package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Kseniia", 'F', 28);

        System.out.println(person1);
        System.out.println(person2);

/*        ArrayList<Person> list = new ArrayList<>(Arrays.asList(person1, person2));
        System.out.println(list);
        */



    }
}
