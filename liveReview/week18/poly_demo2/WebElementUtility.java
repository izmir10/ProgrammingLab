package week18.poly_demo2;

public class WebElementUtility {

    // we will have a method with polymorphic parameter
    // an object reference of WebElement Interface

    public static void clickElement(WebElement element){
        System.out.println("Clicking on the Element");
        element.click();  // our element object is a polymorphic object and can reach either InputField or Links class implementation
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with text: " + txt);
        return new Links();  // or new InputField();
    }


}
