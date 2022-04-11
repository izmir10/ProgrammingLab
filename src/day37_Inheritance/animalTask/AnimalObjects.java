package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Parrot parrot = new Parrot("King", "Macaw", 'F', 2, "Small", "Rainbow");

        parrot.sing();
        System.out.println(parrot);

        System.out.println(parrot.name + ", " + parrot.breed);

        System.out.println("---------------------------------");

        Dog dog = new Dog("Max", "Golden", 'M', 4, "Medium", "Carrot");
        System.out.println(dog);
        System.out.println(dog.name + ", " + dog.breed);
        dog.bark();

        System.out.println("-------------------------------");

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "Black & Gray");
        Cat cat2 = new Cat("Uslu", "Tekir", 'F', 5, "Medium", "Yellow & White");

        System.out.println(cat1);
        System.out.println(cat2);

/*        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            if (cat.gender == 'F'){
                System.out.println(cat.name);
            }
        }
        */

//        Animal[] animals = {cat1, cat2, dog, parrot};


    }
}
