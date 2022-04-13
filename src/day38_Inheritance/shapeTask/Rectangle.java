package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double w;
    public double l;

    public Rectangle(String name) {
        super(name);
        System.out.println("Enter \"w\" value for rectangle: ");
        this.w = scan.nextDouble();
        System.out.println("Enter \"l\" value for rectangle: ");
        this.l = scan.nextDouble();
    }

    @Override
    public double area() {
        return w * l;
    }

    @Override
    public double perimeter() {
        return (2*w) + (2*l);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", w=" + w + '\'' +
                ", l=" + l + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() +
                '}';
    }
}
