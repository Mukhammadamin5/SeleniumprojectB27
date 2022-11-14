package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName){

        // String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";
        WebElement customerOrderDate = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));

        return customerOrderDate.getText();
    }

    public static void orderVerify(WebDriver driver, String costumerName, String expectedOrderDate){
        WebElement customerOrderDate = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));

        String actualOrderDate = customerOrderDate.getText();

        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }
}