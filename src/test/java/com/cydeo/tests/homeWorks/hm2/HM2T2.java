package com.cydeo.tests.homeWorks.hm2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HM2T2 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // 1. Set up browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectState(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1923");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);

        Assert.assertEquals(year.getFirstSelectedOption().getText(), "1923", "Year Failed");
        Assert.assertEquals(month.getFirstSelectedOption().getText(), "December", "Month Failed");
        Assert.assertEquals(day.getFirstSelectedOption().getText(), "1", "Day Failed");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
