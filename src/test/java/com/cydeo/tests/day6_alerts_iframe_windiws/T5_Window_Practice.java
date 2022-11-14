package com.cydeo.tests.day6_alerts_iframe_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Window_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowTask(){

        String actualTitle = driver.getTitle();
        String expectedTitle= "Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Before opening new window" + actualTitle);

        WebElement clickHereBtn = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereBtn.click();

        actualTitle = driver.getTitle();
        System.out.println("Before after new window" + actualTitle);

        for(String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        actualTitle= driver.getTitle();
        String expectedTitleAfterC = "New Window";

        Assert.assertEquals(actualTitle, expectedTitleAfterC);

    }
}
