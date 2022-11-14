package com.cydeo.tests.homeWorks.hm1;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("https://www.youtube.com");

        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("eminem");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(3000);
        WebElement video = driver.findElement(By.linkText("Eminem - Lose Yourself [HD]"));
        video.click();

        WebElement title = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer'])[1]"));
        System.out.println(title.getText());
    }
}
