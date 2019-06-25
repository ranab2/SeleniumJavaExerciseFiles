import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.cssSelector("#datepicker"));
        dateField.sendKeys("06/25/2019");
        Thread.sleep(2000);
        dateField.sendKeys(Keys.ARROW_UP);
        Thread.sleep(2000);
        dateField.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateField.sendKeys(Keys.ARROW_RIGHT);
        Thread.sleep(2000);
        dateField.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(2000);
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(2000);



        driver.quit();
    }
}