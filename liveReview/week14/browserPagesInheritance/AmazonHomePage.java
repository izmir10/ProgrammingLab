package week14.browserPagesInheritance;

public class AmazonHomePage extends Browser{

    public String product;


    public AmazonHomePage(String name) { //super class constructor always execute before subclass constructor
        super(name);
    }

    public void navigateTo(String link){
        // normally we will have selenium code, but right now we will just use println to understand inheritance
        System.out.println("Navigating to " + link + " using " + super.getName());
    }

    public void shopFor(String product){
        this.product = product; // instead of initializing in the constructor, we initialized inside the method
        System.out.println("Navigating to "+ this.product + " 's Page");
    }


}
