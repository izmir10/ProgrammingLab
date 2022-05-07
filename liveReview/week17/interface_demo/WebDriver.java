package week17.interface_demo;

public interface WebDriver {
    void get(String url); //automatically public abstract
    void findElemet(String locator);
    void quit();
    String getTitle();


}
