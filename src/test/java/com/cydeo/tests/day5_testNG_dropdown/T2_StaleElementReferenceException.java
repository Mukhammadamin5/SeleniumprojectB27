package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementReferenceException {
    public static void main(String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementBtn = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementBtn.click();

        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));

        deleteBtn.click();


        try {
            System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
        } catch (StaleElementReferenceException e){
            System.out.println("Stale Element Reference Exception is thrown and this is already expected");
        }

        driver.quit();


    }
}
