package com.cydeo.tests.homeWorks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AA {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("https://www.youtube.com");

        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("eminem");
        driver.findElement(By.id("search-icon-legacy")).click();


        WebElement video = driver.findElement(By.linkText("Eminem - Lose Yourself [HD]"));
        video.click();


    }
}
