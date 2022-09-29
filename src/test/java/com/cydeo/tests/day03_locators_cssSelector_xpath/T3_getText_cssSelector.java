package com.cydeo.tests.day03_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getText_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        // WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        // WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        // WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));

        // WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));
    }
}
