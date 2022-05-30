import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloSeleniumTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://testeroprogramowania.github.io/selenium/basics.html";
        driver.get(url);

        //driver.findElement(By.id("clickOnMe")).click();
        //driver.findElement(By.name("fname")).click();
        //driver.findElement(By.name("fname")).sendKeys("Pawel");

        WebElement kliknijMnie = driver.findElement(By.id("clickOnMe"));
        WebElement firstName = driver.findElement(By.name("fname"));



       // kliknijMnie.click();
        firstName.click();
        firstName.sendKeys("Pawel");





        //driver.findElement(By.xpath("//*[@name=\"search\"]")).click();
        //driver.findElement(By.xpath("//*[@name=\"search\"]")).sendKeys("call of duty");
        //driver.findElement(By.xpath("//*[@class=\"search-button\"]")).click();
        //driver.quit();




    }
}
