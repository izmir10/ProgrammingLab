package week17.interface_demo;

public class ChromeDriver implements WebDriver {

    public ChromeDriver(){
        System.out.println("Launching Chrome Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Chromedriver - navigating to " + url);
    }

    @Override
    public void findElemet(String locator) {
        System.out.println("Chromedriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("Chromedriver - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "EU8 UI Automation";
    }

    public void someUniqueMethod(){
        System.out.println("I am just belonging to ChromeDriver class");
    }
}
