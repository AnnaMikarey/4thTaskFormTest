import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsFillAllForm() {
        driver.get("https://automationexercise.com/contact_us");
              WebElement nameInput = driver
                       .findElement(By.cssSelector("#contact-us-form > div:nth-child(2) > input"));
              nameInput.sendKeys("Anna");

              WebElement emailInput = driver
                      .findElement(By.cssSelector("#contact-us-form > div:nth-child(3) > input"));
              emailInput.sendKeys("annaAnisimovaal@gmail.com");

              WebElement subjectInput = driver
                       .findElement(By.cssSelector("#contact-us-form > div:nth-child(4) > input"));
              subjectInput.sendKeys("question");

              WebElement massageInput = driver
                        .findElement(By.cssSelector("#message"));
              massageInput.sendKeys("questionText");

              WebElement submitButton = driver
                      .findElement(By.cssSelector("#contact-us-form > div:nth-child(7) > input"));
              submitButton.click();
        Alert alert = driver.switchTo().alert();
//        WebDriverWait wait = new  WebDriverWait(driver, 20);
                alert.accept();
        WebElement confirmMassage = driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success"));
              Assert.assertEquals("Success! Your details have been submitted successfully.", confirmMassage.getText());
    }
}
