package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Medium", "White");
        System.out.println(dog);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();

        Cat cat = new Cat();
        cat.setInfo("Mia", "Scottish", 'F', 3, "Small", "Gray");
        System.out.println(cat);

        cat.eat();
        cat.drink();
        cat.scratch();
        cat.sleep();
        //cat.bark();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");
        System.out.println(tiger);

        tiger.eat();
        tiger.drink();
        tiger.hunt();
        tiger.roar();


    }
}
