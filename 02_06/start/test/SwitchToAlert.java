import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import sun.jvm.hotspot.utilities.Assert;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        //String alertText = alert.getText();
        //String expectedText = "This is a test alert!";
        //Assert.assertEquals(expectedText,alertText);
        alert.accept();


        driver.quit();
    }
}
