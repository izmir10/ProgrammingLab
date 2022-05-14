package week18.poly_demo;

public class SuperManTest {
    public static void main(String[] args) {

        //polymorphism
        //interface/parent class RN = ChildClass

        Parent superManOne = new Father();  //Polymorphism. Reference type decides which methods are accessable
                                            //We can not reach worker interface methods
        superManOne.feedKid();
        superManOne.playWithKid();
        superManOne.raiseKid();
        // superManOne.work("SDET");  //==> Error! Unreachable

        Worker superManTwo = new Father();  //Polymorphism.
        superManTwo.getPaid();
        superManTwo.work("SDET");

        Father superManThree = new Father();    //NOT Polymorphism.
        superManThree.feedKid();
        superManThree.playWithKid();
        superManThree.raiseKid();
        superManThree.getPaid();
        superManThree.work("SDET");

/*
        boolean b1 = superManOne instanceof Father;
        boolean b2 = superManTwo instanceof Father;
        boolean b3 = superManThree instanceof Father;

        System.out.println("b1 = " + b1); // true
        System.out.println("b2 = " + b2); // true
        System.out.println("b3 = " + b3); // true
*/


    }
}
