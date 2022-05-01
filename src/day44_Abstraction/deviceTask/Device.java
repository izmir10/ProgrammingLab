package day44_Abstraction.deviceTask;

public abstract class Device {

    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            throw new RuntimeException("Color can not be null");
        }
        this.color = color;
    }


    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if(brand.isEmpty()){
            throw new RuntimeException("Can not be null");
        }
        this.brand = brand;

        if(model.isEmpty()){
            throw new RuntimeException("Can not be null");
        }
        this.model = model;

        if(size.isEmpty()){
            throw new RuntimeException("Can not be null");
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
