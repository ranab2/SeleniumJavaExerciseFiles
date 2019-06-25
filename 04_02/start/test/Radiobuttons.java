import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(2000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));//
        radioButton2.click();
        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(2000);

        driver.get("https://formy-project.herokuapp.com/checkbox");
        Thread.sleep(2000);
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        checkBox1.click();
        Thread.sleep(2000);
        checkBox1.click();
        Thread.sleep(2000);

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkBox2.click();
        Thread.sleep(2000);
        checkBox2.click();
        Thread.sleep(2000);

        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkBox3.click();
        Thread.sleep(2000);
        checkBox3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
