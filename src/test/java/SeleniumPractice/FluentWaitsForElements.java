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
                .pollingEvery(Duration.ofMillis(30))
                .ignoring(NoSuchElementException.class)
                .withMessage("Please check the element maentioned");

        By clickableElement = wait.until(new Function<WebDriver, By>() {
            public By apply(WebDriver driver) {
                return By.xpath("//a[text() = 'Hom']");
            }
        });

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text() = 'Hom']"))));

        driver.findElement(clickableElement).click();

        element2.click();


    }


}
