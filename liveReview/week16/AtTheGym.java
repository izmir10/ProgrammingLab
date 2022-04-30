package week16;

public class AtTheGym {
    public static void main(String[] args) {

        // Exercise exercise = new Exercise(); ==> 'Exercise' is abstract; cannot be instantiated

        Running running = new Running(80);
        Swimming swimming = new Swimming(80);
        FreeWeight freeWeight = new FreeWeight(80);

        running.start();
        running.perform();
        System.out.println("Running for 30 minutes - calories: " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming for 30 minutes - calories: " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight exercise for 30 minutes - calories: " + freeWeight.getCaloriesCount(30));


        // polymorphism
        Exercise polyObject = new Running(80); // ==> next weeks topic, but we can create an object from different class


    }
}
