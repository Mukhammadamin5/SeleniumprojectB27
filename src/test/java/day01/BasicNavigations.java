package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        // 3. go to "https://www.tesla.com/"
        // driver.get("https://www.tesla.com/");

        // navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.tesla.com/");

        // stops execution of code for 3 sec
        Thread.sleep(3000);

        // navigate().back() method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);

        //System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // close() method will close current opened page
        // driver.close();

        // quit() method will close all opened pages
         driver.quit();
    }
}
