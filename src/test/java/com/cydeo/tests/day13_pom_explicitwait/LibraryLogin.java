package com.cydeo.tests.day13_pom_explicitwait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLogin {

   LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.app.url"));
        libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){

//        Driver.getDriver().get("https://library1.cydeo.com");
//
//        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();


        Assert.assertTrue(libraryLoginPage.fieldRequirementErrorMsg.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test(){

//        Driver.getDriver().get("https://library1.cydeo.com");
//
//        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUserName.sendKeys("asda");


        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.enterInvalidEmailMsg.isDisplayed());
    }

    @Test
    public void a(){
//        Driver.getDriver().get("https://library1.cydeo.com");
//
//        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUserName.sendKeys("asda@gmail.com");

        libraryLoginPage.inputPassword.sendKeys("asdascsa");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMsg.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
