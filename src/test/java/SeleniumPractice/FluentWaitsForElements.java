package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


import java.time.Duration;
import java.util.function.Function;

public class FluentWaitsForElements {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://echarts.apache.org/examples/en/index.html");


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class)
                .withMessage("Please check the element maentioned");

        WebElement clickableElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//a[text() = 'Hom']"));
            }
        });

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text() = 'Hom']"))));

        clickableElement.click();

        element2.click();


    }


}
