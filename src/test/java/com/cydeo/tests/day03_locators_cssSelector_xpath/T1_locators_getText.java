package com.cydeo.tests.day03_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect" + Keys.ENTER);

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("test invalid login PASSED");
        } else {
            System.out.println("test invalid login FAILED");
        }

        driver.quit();




    }
}
