import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        Thread.sleep(2000);

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(2000);

        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            Thread.sleep(2000);
        }

        driver.close();
        Thread.sleep(2000);

        driver.switchTo().window(originalHandle);
        Thread.sleep(2000);

        driver.quit();
    }
}
