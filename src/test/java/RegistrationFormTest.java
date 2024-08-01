import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RegistrationFormTest {
    WebDriver driver;

    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void registrationForm() {
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        driver.findElement(By.id("first_name")).sendKeys("Tama");
        driver.findElement(By.id("last_name")).sendKeys("Shil");
        driver.findElement(By.id("user_email")).sendKeys("iips@gmail.com");
        driver.findElement(By.id("radio_1665627729_Male")).click();
        driver.findElement(By.id("user_pass")).sendKeys("Kioh87!73Hju2");
        Utils.scroll(driver, 500);

        String datePicker = "document.getElementsByClassName('ur-flatpickr-field')[0].setAttribute('value', '2000-09-21');";
        ((JavascriptExecutor) driver).executeScript(datePicker);

        driver.findElement(By.id("input_box_1665629217")).sendKeys("Bangladeshi");
//
        String phoneNumber = "document.getElementById('phone_1665627880').setAttribute('value', '1992727550')";
        ((JavascriptExecutor) driver).executeScript(phoneNumber);
//        driver.findElement(By.id("phone_1665627880")).sendKeys(Keys.chord("(199) 272-7550"));

        // Set the phone number using JavaScriptExecutor
        // Use JavaScriptExecutor to clear the field first



        WebElement dropdownElement = driver.findElement(By.id("country_1665629257"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Bangladesh");

//        String script2 = "document.getElementById('phone_1665627865').value = '0199927274'";
//        ((JavascriptExecutor) driver).executeScript(script2);


        String arrivalDatePicker = "document.getElementsByClassName('ur-flatpickr-field')[1].setAttribute('value', '2024-07-15');";
        ((JavascriptExecutor) driver).executeScript(arrivalDatePicker);

        driver.findElement(By.id("number_box_1665629930")).sendKeys("3");
        driver.findElement(By.id("input_box_1665630010")).sendKeys("10B");
        driver.findElement(By.id("textarea_1665630078")).sendKeys("Teacher at X university");
        driver.findElement(By.id("radio_1665627931_Yes")).click();
        driver.findElement(By.id("radio_1665627997_Single Room")).click();
        driver.findElement(By.id("radio_1665628131_Vegetarian")).click();
        driver.findElement(By.id("radio_1665628131_Vegetarian")).click();


        Utils.scroll(driver, 500);
        WebElement selectElement = driver.findElement(By.id("select_1665628361"));
        selectElement.click();
        Actions selectactions = new Actions(driver);
        selectactions.keyDown(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).perform();
        driver.findElement(By.id("privacy_policy_1665633140")).click();
        driver.findElement(By.cssSelector("button.btn.button.ur-submit-button")).click();

       // String actualText = driver.findElement(By.id("ur-submit-message-node")).getText();
       // String actualText = driver.findElement(By.CSS_SELECTOR, "#ur-submit-message-node ul")
      //  WebElement successMessage = driver.findElement(By.cssSelector("#ur-submit-message-node ul"));
        //assertEquals(successMessage.getText(), "User successfully registered.");
       // String expectedText = "User successfully registered.";
        //assertEquals(actualText, expectedText);

    }

    @AfterAll
    public void closeDriver() {
          driver.quit();

    }

}
