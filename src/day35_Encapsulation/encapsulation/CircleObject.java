package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.6);
//        circle1.setRadius(2.5);

        System.out.println("circle1 = " + circle1);

        circle1.calcArea();
        circle1.calcPerimeter();





    }
}
