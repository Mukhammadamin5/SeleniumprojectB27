package com.cydeo.tests.day11_upload_actions_javascripttexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Guru99_Upload_Test {

    @Test
    public void guru99_upload_teat(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("C:\\Users\\HP_001\\OneDrive\\Desktop\\New Text Document.txt");

        WebElement termsOfService = Driver.getDriver().findElement(By.id("terms"));
        termsOfService.click();

        Driver.getDriver().findElement(By.id("submitbutton")).click();

        BrowserUtils.sleep(5);
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));

        String expectedMsg = "1 file\nhas been successfully uploaded.";
        String actualMsg = resultMsg.getText();

        Assert.assertEquals(actualMsg, expectedMsg);



    }
}
