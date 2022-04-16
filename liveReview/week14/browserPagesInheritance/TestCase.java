package week14.browserPagesInheritance;

public class TestCase {
    public static void main(String[] args) {

        // If I want to use fields and methods of Browser Class: do I have to create an object from browser class? Can I also reach with child class object?

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating : "+amazonHomePage.getName());
        System.out.println("My operating system is : "+ Browser.getOSName()); // use class name for static field

        amazonHomePage.navigateTo("www.amazon.com");

        amazonHomePage.navigateTo("Search for laptops");

        amazonHomePage.shopFor("Samsung PC");

// Can I use amazonHomePage object to reach ProductPage shopFor method

        ProductPage productObject = new ProductPage("Chrome",2);
        String product = amazonHomePage.product;
        productObject.shopFor(product);  //




    }
}


/*
Let's create a Test Case together:
      1. I need to set my browser and OS type
      2. Navigate to App's Page
      3. navigate to laptops and select Samsung PC
      4. Go to product's page, buy 2 of them, add to cart
      5. Go to cart, fill all the fields and order
      6. Check the amount and prices are as expected
 */