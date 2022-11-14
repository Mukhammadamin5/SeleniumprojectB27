package com.cydeo.tests.day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavascriptExecutor_Scroll {

    @Test
    public void task7_javascriptExecutor_scroll_test(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        // We have to do downCasting(typecasting) to JavascriptExecutor interface

        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));


        BrowserUtils.sleep(2);

        //3- Scroll down to "Cydeo" link
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink, homeLink);

        BrowserUtils.sleep(2);

        //3- Scroll down to "home" link
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
    }
}
