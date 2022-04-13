package day38_Inheritance.shapeTask;

public class Square extends Shape{

    public double s;

    public Square(String name) {
        super(name);
        System.out.println("Enter \"side\" value for square:");
        this.s = scan.nextDouble();
    }

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return s * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", s=" + s +  '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() +
                '}';
    }
}
