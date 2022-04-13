package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(7);
        System.out.println(square);

      //  square.setSide(-9); // we assigned a condition that side can not be less than and equal to 0
      //  square.side = 20; // since side data is private, I can not access it directly
        square.setSide(9);
        System.out.println(square.getSide());


        System.out.println("----------------------------");
        Rectangle rectangle = new Rectangle(8, 10);
        System.out.println(rectangle);

        rectangle.setLength(5);
        System.out.println(rectangle.getLength());

        System.out.println("name: " + rectangle.getName());

        System.out.println(rectangle);


        System.out.println("------------------------");
        Circle circle = new Circle(4.5);

        System.out.println(circle);

        circle.setRadius(9.4);
        System.out.println(circle.area());




    }
}
