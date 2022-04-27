package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

    //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create an object from an abstract class
        // because abstract classes are not concrete

        Honda honda = new Honda("Accord", "White", 2020, 20000);

        Audi audi = new Audi("TT", "Titanium Gray", 2022, 50000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------");

        honda.setColor("Pink");
        audi.setColor("Green");
        tesla.setColor("Blue");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }
}
