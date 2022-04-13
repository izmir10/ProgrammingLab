package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    public double r;
    public static double pi = 3.14;


    public Circle(String name) {
        super(name);
        System.out.println("Enter \"r\" value for circle:");
        this.r = scan.nextDouble();
    }


    @Override
    public double area() {
        return (r * r * pi);
    }

    @Override
    public double perimeter() {
        return 2 * pi * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name +
                ", r=" + r + '\'' +
                ", pi=" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
