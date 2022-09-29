package com.cydeo.tests.day04_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate using cssSelector with close
        WebElement homeLink1 = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate using xpath with class attribute syntax
        WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        // Locate using cssSelector with class attribute
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // Locate using cssSelector with class attribute
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        // Locate using xpath with class attribute syntax
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // Locate using cssSelector with class attribute
        WebElement forgotPassword4 = driver.findElement(By.xpath("//div[@class='example']/h2"));

        // Locate using cssSelector with class attribute
        WebElement emailText1 = driver.findElement(By.xpath("//label[.='E-mail']"));

        //
        WebElement emailText2 = driver.findElement(By.xpath("//label[contains(@for,'email')]"));

        //
        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

        //
        WebElement poweredByCYDEO = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //isDisplayed() method return to boolean true/false
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("homeLink2.isDisplayed() = " + homeLink2.isDisplayed());
        System.out.println("homeLink3.isDisplayed() = " + homeLink3.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("forgotPassword2.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("forgotPassword3.isDisplayed() = " + forgotPassword3.isDisplayed());
        System.out.println("forgotPassword4.isDisplayed() = " + forgotPassword4.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText1.isDisplayed());
        System.out.println("emailText2.isDisplayed() = " + emailText2.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCYDEO.isDisplayed() = " + poweredByCYDEO.isDisplayed());


    }
}
