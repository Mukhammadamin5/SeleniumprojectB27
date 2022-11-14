package com.cydeo.tests.day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        // Click Accept cookies button to not have any issue
//        WebElement acceptCookies = Driver.getDriver()
        // Create Actions object
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();


        String actualTextOnBigCircle = bigCircle.getText();
        String expectedTextOnBigCircle = "You did great!";

        Assert.assertEquals(actualTextOnBigCircle, expectedTextOnBigCircle);
    }
}
