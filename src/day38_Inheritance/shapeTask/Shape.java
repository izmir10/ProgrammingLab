package day38_Inheritance.shapeTask;

import java.util.Scanner;

public class Shape {

    public String name;

    Scanner scan = new Scanner(System.in);


    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
