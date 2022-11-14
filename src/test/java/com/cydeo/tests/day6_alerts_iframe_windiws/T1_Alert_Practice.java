package com.cydeo.tests.day6_alerts_iframe_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertTask(){
        WebElement informationAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertBtn.click();

        // To handle JS alerts we have to use Alert
        Alert alert = driver.switchTo().alert();
        // accept() method will click OK button
        alert.accept();

        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));
        String actualTextMessage = textMessage.getText();
        String expectedMessage = "You successfully clicked an alert";

        Assert.assertEquals(actualTextMessage, expectedMessage, "Fail");

    }
}
