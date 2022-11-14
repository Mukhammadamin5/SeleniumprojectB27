package com.cydeo.tests.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

// This class is the parent of all Test classes
// You will update this class based on what you are keep writing in your most test classes
// instead writing in all test classes, you can just write in this class and you can extends this class from any class
public abstract class TestBase {

    protected WebDriver driver; // protected - it will be useful only in this package

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // int your work environment we will be navigation same link and you can
        // still use TestBase class to navigate same page for all test classes
        // Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
