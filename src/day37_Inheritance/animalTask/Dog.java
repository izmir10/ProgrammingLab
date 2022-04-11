package day37_Inheritance.animalTask;

public class Dog extends Animal{

/*    public Dog(){
        //constructor name must have the same name with the class name
        //parent class's constructor can not be inherited from parent class
        //but, it can be called from parent class
        //if a default constructor used at the parent class, subclass can call it implicitly
        //but if it not a default constructor (= has arguments), we must call it explicitly
    }*/


    public Dog (String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }


}
