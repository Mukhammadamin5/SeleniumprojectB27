package com.cydeo.tests.day9_proporties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_SRM_Login extends TestBase {

    @Test
    public void crm_login_test(){
        driver.get("c");

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("hr2@cydeo.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_2(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver);
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_3(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver, "hr2@cydeo.com", "UserUser");
        BrowserUtils.verifyTitle(driver, "Portal");
    }
}
