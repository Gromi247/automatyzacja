import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LocatingElementsTest {

    @Test
    public void locatorExam() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Use CSS Selectors
        driver.findElement(By.cssSelector("input[name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[name='login-button']")).click();

        //Use CSs/Xpath

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        //Use the best locator
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("first name");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("last name");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("zip");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#checkout_complete_container")).isDisplayed());

        driver.quit();


    }


}
