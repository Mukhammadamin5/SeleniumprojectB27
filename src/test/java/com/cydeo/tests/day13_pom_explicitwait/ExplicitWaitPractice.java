package com.cydeo.tests.day13_pom_explicitwait;

import com.cydeo.pages.DynamicallyLoadedPage_1;
import com.cydeo.pages.DynamicallyLoadedPage_7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class
ExplicitWaitPractice {

    @Test
    public void dynamically_loaded_page_elements_7_test(){

        Driver.getDriver().get("//Driver.getDriver().get(\"https://library1.cydeo.com\")");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicallyLoadedPage_7 dynamicallyLoadedPage_7= new DynamicallyLoadedPage_7();
        Assert.assertTrue(dynamicallyLoadedPage_7.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicallyLoadedPage_7.spongeBob.isDisplayed());
    }

    @Test
    public void dynamically_loaded_page_elements_1_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicallyLoadedPage_1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage_1();
        dynamicallyLoadedPage1.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loadingBar));
    }

}
