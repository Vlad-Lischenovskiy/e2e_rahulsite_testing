import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenCart {
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] vaggies = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver, vaggies);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver, String[] vaggies){
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));


        for(int i = 0; i < products.size(); i++){
            String[] name = products.get(i).getText().split("-");
            String formatedNames = name[0].trim();

            List itemsNeededList = Arrays.asList(vaggies);


            if(itemsNeededList.contains(formatedNames)){
                j++;
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
                if(j == 3){
                    break;
                }
            }
        }
    }
}
