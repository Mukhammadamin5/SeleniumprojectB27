package com.cydeo.tests.day04_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        // locate all the links in the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print out the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());

        // Print out the texts of the links
        for (WebElement eachLink : allLinks){
            System.out.println("Text of each link: " + eachLink.getText());
            System.out.println("href value for each link:" + eachLink.getAttribute("href"));
        }




        driver.quit();
    }
}
