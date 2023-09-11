import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellIntroduction {
    public static void main(String[] args){

        //Invoking Browser
        //System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
    }
}
