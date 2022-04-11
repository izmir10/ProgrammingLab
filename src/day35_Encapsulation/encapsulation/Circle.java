package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }


    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", pi= " + pi +
                '}';
    }

    public void calcArea(){
        double area = pi * radius* radius;
        System.out.println("area = " + area);
    }

    public void calcPerimeter(){
        System.out.println("Perimeter: " + pi * (2 * radius));
    }






}
