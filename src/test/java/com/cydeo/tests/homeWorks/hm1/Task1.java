package com.cydeo.tests.homeWorks.hm1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement headerText = driver.findElement(By.id("global-enhancements-search-query"));
        headerText.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedOutPut = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (expectedOutPut.equals(actualTitle)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }




    }
}
