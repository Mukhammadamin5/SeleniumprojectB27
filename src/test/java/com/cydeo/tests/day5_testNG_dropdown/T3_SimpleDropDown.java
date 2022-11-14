package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_SimpleDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void simpleDropDown(){
        driver.get("https://practice.cydeo.com/dropdown");

        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));

        simpleDropDown.getFirstSelectedOption().getText();

        String actualSimpleDropDown = simpleDropDown.getFirstSelectedOption().getText();
        String expectedSimpleDropDown = "Please select an option";

        Assert.assertEquals(actualSimpleDropDown, expectedSimpleDropDown);

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropDown = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDropDown = "Select a State";

        Assert.assertEquals(actualStateDropDown, expectedStateDropDown);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
