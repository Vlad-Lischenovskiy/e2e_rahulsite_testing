import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GreenCart {
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        int j = 0;
        String[] vaggies = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
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
