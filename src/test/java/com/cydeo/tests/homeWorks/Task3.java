package com.cydeo.tests.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement a =driver.findElement(By.partialLinkText("Gmail"));
        a.click();

        String expected = "Gmail";
        String actual = driver.getTitle();

        if (actual.contains(expected)){
            System.out.println("Gmail Passed");
        } else{
            System.out.println("Gmail Failed");
        }

        driver.navigate().back();

        actual = driver.getTitle();
        if (actual.equals("Google")){
            System.out.println("Google Passed");
        } else {
            System.out.println("Google Failed");
        }
    }
}
