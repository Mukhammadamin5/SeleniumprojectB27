package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockey = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockey.click();

        if (hockey.isSelected()){
            System.out.println("Hockey button is Selected");
        } else {
            System.out.println("Hockey button is not Selected");
        }

        driver.quit();

    }
}
