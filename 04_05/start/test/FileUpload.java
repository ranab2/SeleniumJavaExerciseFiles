import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

       // WebElement chooseButton = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-choose"));
        //chooseButton.click();
        //Thread.sleep(2000);
        //chooseButton.sendKeys(Keys.ESCAPE);

        WebElement filePath = driver.findElement(By.id("file-upload-field"));
        filePath.sendKeys("/Users/ranakhurramshahzad/Documents/selenium-server-standalone-3.141.59.jar");
        //Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement resetButton = driver.findElement(By.cssSelector(".btn.btn-warning.btn-reset"));
        resetButton.click();
        Thread.sleep(2000);


        driver.quit();
    }
}
