import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BluegamesExercises {

    @Test
    public void bluegamesTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://bluegames.pl/";
        driver.get(url);
        driver.manage().window().maximize();


        //Przy używaniu selectorów chciałem dla treningu czasem używać xPathów a czasem CSSselectorów 
        WebElement searchButton = driver.findElement(By.xpath("//*[@class=\"search-button\"]"));
        WebElement serachBar = driver.findElement(By.xpath("//*[@class=\"search-input tt-input\"]"));

        serachBar.click();
        serachBar.sendKeys("call of duty");
        searchButton.click();
        Thread.sleep(5000);



        WebElement selectCategory = driver.findElement(By.xpath("//*[@name=\"category_id\"]"));
        Select console = new Select(selectCategory);
        console.selectByValue("101");

        WebElement searchButtonSecond = driver.findElement(By.cssSelector("[id='button-search']"));
        searchButtonSecond.click();








        //driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();


    }


}
