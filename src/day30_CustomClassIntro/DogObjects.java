package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Caramel", "Chov Chov", 3, 'F', "Medium", "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Carin", "Pit Bull", 7, 'F', "Extra Large", "Yellow");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender == 'F'){
                femaleDogs.add(each);
            }
        }

        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender == 'F');


        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);


    }
}
