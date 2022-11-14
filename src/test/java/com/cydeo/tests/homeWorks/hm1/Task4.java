package com.cydeo.tests.homeWorks.hm1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        driver.findElement(By.partialLinkText("Home")).click();

        if (driver.getTitle().equals("Practice")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
