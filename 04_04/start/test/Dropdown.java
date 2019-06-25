import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle"));
        dropDown.click();
        Thread.sleep(2000);

        WebElement dropDownOption1 = driver.findElement(By.cssSelector("#autocomplete"));
        dropDownOption1.click();
        Thread.sleep(2000);

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDown1 = driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle"));
        dropDown1.click();
        Thread.sleep(2000);

        WebElement dropDownOption2 = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        dropDownOption2.click();
        Thread.sleep(2000);

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDown2 = driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle"));
        dropDown2.click();
        Thread.sleep(2000);

        //Select dropDownOptions = new Select(dropDown2);



        driver.quit();
    }
}
