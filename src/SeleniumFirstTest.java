import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {

    WebDriver webDriver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mymac/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.javatpoint.com/");
    }

    public static void main(String[] args) {
        SeleniumFirstTest seleniumFirstTest = new SeleniumFirstTest();
        seleniumFirstTest.launchBrowser();
    }
}
