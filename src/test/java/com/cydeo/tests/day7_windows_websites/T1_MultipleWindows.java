package com.cydeo.tests.day7_windows_websites;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test(){

        //Assert.assertEquals(driver.getTitle(), "Windows");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        driver.findElement(By.linkText("Click Here")).click();

        WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        cydeo.click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        Assert.assertEquals(driver.getTitle(), "Cydeo");


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
