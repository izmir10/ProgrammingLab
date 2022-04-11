package day35_Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Selim", 42, 'M', "Java");

        System.out.println(person1);

        person1.eat("Hamburger");
        person1.drink("Ginger Ale");



    }
}
