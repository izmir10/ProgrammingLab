package week17;

public class TestEdible {
    public static void main(String[] args) {

    Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        Edible.staticMethod();

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
                ((Edible) objects[i]).someMethod();
            }
            if (objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }

    }
}


interface Edible{
    //Describes how to eat
    public abstract String howToEat(); //public abstract is redundant

    default void someMethod(){ // belongs to the instance of this Interface
        System.out.println("This line comes from Interface");
    }

    static void staticMethod(){ //belongs to Interface itself
        System.out.println("This line comes from static method");
    }
}

abstract class Animal{
    //return animal sounds
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Chicken : Fry it";
    }

    @Override
    public String sound() {
        return "Chicken : cluck cluck";
    }
}

class Tiger extends Animal{

    @Override
    public String sound() {
        return "Tiger: roarrr";
    }
}

abstract class Fruit implements Edible{//abstract class implements interface

}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple: make apple cider";
    }
}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }
}