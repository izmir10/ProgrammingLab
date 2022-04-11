package day36_Inheritance.animalTask;

public class Cat extends Animal { // Cat is an Animal

    public void scratch(){
        System.out.println(name + " is scratching");
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}

/*
Cat class inherited
    6 variables
    6 methods
        from Animal (parent/super) class
 */
