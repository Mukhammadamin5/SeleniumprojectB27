package com.cydeo.tests.day14_explicitwait_review;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InternetSpeedTest {

    @Test
    public void internet_speed_test(){
        Driver.getDriver().get("https://www.speedtest.net");

        // Wait until Results link is displayed
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 90);
        InternetSpeedPage internetSpeedPage = new InternetSpeedPage();

        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.resultLink));

        internetSpeedPage.goButton.click();

        // 5 Wait until gouge-speed-needle displayed
        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        // 6 Wait until gouge-speed-needle disapper
        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        // Print Download and Upload Speeds
        System.out.println("internetSpeedPage.downLoadSpeed = " + internetSpeedPage.downLoadSpeed.getText());

        System.out.println("internetSpeedPage.uploadSpeed = " + internetSpeedPage.uploadSpeed.getText());
    }
}
