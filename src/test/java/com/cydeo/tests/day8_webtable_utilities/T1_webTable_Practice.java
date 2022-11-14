package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_webTable_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){
        WebElement bobMartin = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartin.getText();

        Assert.assertEquals(actualBobName, expectedBobName);

        // you can also use this xpath //td[.='Bob Martin']/..//td[5]
        WebElement bobMartinDate = driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertEquals(bobMartinDate.getText(), "12/31/2021");
    }

    @Test
    public void test2(){
        String customerOrderDate = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate = " + customerOrderDate);
    }

    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
