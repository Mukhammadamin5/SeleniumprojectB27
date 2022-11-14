package com.cydeo.tests.homeWorks.hm2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HM2T1 {
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

        Select dropdown = new Select(driver.findElement(By.id("state")));
        dropdown.selectByVisibleText("Illinois");
        dropdown.selectByValue("VA");
        dropdown.selectByIndex(5);

        String actual = dropdown.getFirstSelectedOption().getText();
        String expected = "California";

        Assert.assertEquals(actual, expected, "Final selected option verification is failed");


        int index = -1;
        for (WebElement eachState : dropdown.getOptions()){
            index++;
            if(eachState.getText().equals("California")){
                System.out.println(index);
            }
        }
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
