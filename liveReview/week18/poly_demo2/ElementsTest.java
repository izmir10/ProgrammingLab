package week18.poly_demo2;

public class ElementsTest {
    public static void main(String[] args) {

        Links links = new Links(); // No Polymorphism; it reaches implementation of the methods at the Links class

        links.click();
        links.getLinkHref();
        links.getText();
        links.sendKeys("EU8");


        WebElement loginLink = new Links(); // There is Polymorphism here

        loginLink.click(); //Dynamic Polymorphism (Dynamic Binding)
        String text = loginLink.getText();
        System.out.println("text = " + text);
        ((Links)loginLink).getLinkHref();  // Down-casting

        WebElement userName = new InputField(); //Polymorphism
        userName.click();
        userName.sendKeys("superman");
        userName.getText();

        ((InputField)userName).getValue(); //This method can be reached only by down-casting

        System.out.println("----Changed object of the reference type---");
        userName = new Links();
        // ((Links)userName).click();  // No need to down-cast, because click() is already defined in the parent and child class
        ((Links)userName).getLinkHref();

        userName = new InputField();

        //two objects: one from InputFiedl, other from Links
        WebElementUtility.clickElement(loginLink);
        WebElementUtility.clickElement(userName);
        // WebElementUtility.clickElement(new String "Hello"); // String class is not child of WebElement class
        WebElementUtility.clickElement(links);

        WebElement login = WebElementUtility.getLinkWithText("login");
        login.click();

        ((Links)login).getLinkHref();


    }
}
