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

public class HM2T3 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // 1. Set up browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void selectState(){

        driver.findElement(By.linkText("Dropdown link")).click();
        driver.findElement(By.linkText("Facebook")).click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
