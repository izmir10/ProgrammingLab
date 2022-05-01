package day43_Abstraction.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turned off");
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+ " " + getModel()+ " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand()+ " " + getModel()+ " is texting " + phoneNum);
    }




}
