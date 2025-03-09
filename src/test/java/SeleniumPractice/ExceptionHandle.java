package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ExceptionHandle {


    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void BrowserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://echarts.apache.org/examples/en/index.html");
    }

    @Test
    public void VerifyTest() throws InterruptedException {

        try {

            FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(10)).ignoring(NoSuchElementException.class).withMessage("Check the element: ");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Hom']")));

            boolean b = driver.findElement(By.xpath("//a[text() = 'Hom']")).isDisplayed();

            if (b) {
                System.out.println("Home Element is Displayed");
            } else {
                System.out.println("Element is not displayed");
            }

        } catch (Exception e) {
            System.out.println("Havent found the Home Element:      " + e.getMessage());
        }


        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(10)).ignoring(NoSuchElementException.class).withMessage("Check the element mentioned");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Home']")));

        driver.findElement(By.xpath("//a[text() = 'Home']")).click();

        String title = driver.getTitle();

        softAssert.assertEquals(title, "aiodai");

        System.out.println("***********************************************************************");


    }


    @AfterClass
    public void teardown() {
        driver.close();
    }
}
