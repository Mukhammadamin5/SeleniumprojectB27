package com.cydeo.tests.homeWorks.hm1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expected = "Log in to ZeroBank";
        String actual = driver.getTitle();

        if (expected.equals(actual)){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }
    }
}
