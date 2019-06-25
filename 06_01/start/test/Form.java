import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.beans.Visibility;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranakhurramshahzad/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstNameField = driver.findElement(By.cssSelector("#first-name"));
        firstNameField.sendKeys("Rana Khurram");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement lastNameField = driver.findElement(By.cssSelector("#last-name"));
        lastNameField.sendKeys("Shahad");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement jobTitleField = driver.findElement(By.cssSelector("#job-title"));
        jobTitleField.sendKeys("Technical Product Manager");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement highSchoolRadioButton = driver.findElement(By.cssSelector("input[value='radio-button-1']"));
        //highSchoolRadioButton.click();
        //Thread.sleep(2000);

        WebElement collegeRadioButton = driver.findElement(By.cssSelector("input[value='radio-button-2']"));
        //collegeRadioButton.click();
        //Thread.sleep(2000);

        WebElement gradSchoolRadioButton = driver.findElement(By.cssSelector("input[value='radio-button-3']"));
        gradSchoolRadioButton.click();
        Thread.sleep(2000);

        WebElement maleCheckBox = driver.findElement(By.id("checkbox-1"));
        maleCheckBox.click();
        Thread.sleep(2000);

        WebElement femaleCheckBox = driver.findElement(By.id("checkbox-2"));
        femaleCheckBox.click();
        Thread.sleep(2000);

        femaleCheckBox.click();
        Thread.sleep(2000);

        WebElement preferNotToSayCheckBox = driver.findElement(By.id("checkbox-3"));
        preferNotToSayCheckBox.click();
        Thread.sleep(2000);

        preferNotToSayCheckBox.click();
        Thread.sleep(2000);

        WebElement yearsOfExperienceDropDown = driver.findElement(By.id("select-menu"));
        yearsOfExperienceDropDown.click();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement yearsOfExperineceOption1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='1']")));
        yearsOfExperineceOption1.click();
        Thread.sleep(2000);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("12/12/2000");
        datePicker.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();
        Thread.sleep(2000);

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        String alertActualText = successMessage.getText();
        String alertExpectedText = "The form was successfully submitted!";
        assertEquals(alertExpectedText,alertActualText);
        driver.quit();
    }
}
