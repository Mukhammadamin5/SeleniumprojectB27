package com.cydeo.tests.day9_proporties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.module.Configuration;

public class T3_Config_Practice extends TestBase {

    @Test
    public void google_search_test_using_properties(){

        driver.get(ConfigurationReader.getProperty("google.url"));

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

        String actualTitle = driver.getTitle();
        //String expectedTitle = "apple - Google qidiruvi";
        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google qidiruvi";

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
