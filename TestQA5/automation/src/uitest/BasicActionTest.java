import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicActionTest extends AbstractTest {

    @Test
    public void testPageTitle() {
        //write your code here,
        // Go to Contact us page from homepage and check if we are on the relevant page.
         driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a > i")).click();
         Assert.assertTrue("Auto Exercise - contact Us ".equals(driver.getTitle()));



    }
}
