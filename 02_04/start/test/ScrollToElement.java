import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name_field = driver.findElement(By.id("name"));
//        Actions action = new Actions(driver);
        Thread.sleep(2000);
        name_field.click();
//        action.moveToElement(name_field);
        Thread.sleep(2000);
        name_field.sendKeys("Rana Khurram Shahzad");

        WebElement date_field = driver.findElement(By.id("date"));
        Thread.sleep(2000);
//        action.moveToElement(date_field);
        Thread.sleep(2000);
        date_field.sendKeys("01/01/2020");

        driver.quit();
    }
}
