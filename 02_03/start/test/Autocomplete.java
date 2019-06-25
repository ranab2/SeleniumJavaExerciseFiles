import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        autocomplete.sendKeys("1555 part blvd palo alto");
        Thread.sleep(2000);

        WebElement option = driver.findElement(By.className("pac-item"));
        option.click();

        Thread.sleep(2000);


        driver.quit();
    }
}
